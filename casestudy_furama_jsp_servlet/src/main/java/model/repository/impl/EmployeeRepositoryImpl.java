package model.repository.impl;


import model.bean.Employee;
import model.repository.IEmployeeRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements IEmployeeRepository {

    private String jdbcURL = "jdbc:mysql://localhost:3306/furama_resort?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "869357984756";

    private static final String INSERT_EMPLOYEE_SQL = "INSERT INTO employee (employee_id, employee_name, position_id, education_degree_id, division_id, birthday, id_card, salary, phone, email, address) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    private static final String SELECT_EMPLOYEE_BY_ID = "SELECT employee_id, employee_name, position_id, education_degree_id, division_id, birthday, id_card, salary, phone, email, address FROM employee WHERE employee_id = ?";
    private static final String SELECT_ALL_EMPLOYEE = "SELECT * FROM employee";
    private static final String DELETE_EMPLOYEE_SQL = "DELETE FROM employee WHERE employee_id = ?;";
    private static final String UPDATE_EMPLOYEE_SQL = "UPDATE employee SET employee_name = ?,position_id = ?, education_degree_id = ?, division_id = ?, birthday = ?, id_card = ?, salary = ?, phone = ?, email = ?, address = ? WHERE employee_id = ?;";
    private static final String SELECT_EMPLOYEE_BY_NAME = "SELECT employee_id, employee_name, position_id, education_degree_id, division_id, birthday, id_card, salary, phone, email, address FROM employee WHERE employee_name LIKE ?;";

    public EmployeeRepositoryImpl() {
    }

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }



    @Override
    public void addEmployee(Employee employee) throws SQLException {
        System.out.println(INSERT_EMPLOYEE_SQL);
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_EMPLOYEE_SQL)) {
            preparedStatement.setString(1, employee.getEmployeeName());
            preparedStatement.setInt(2, employee.getPositionId());
            preparedStatement.setInt(3, employee.getEducationDegreeId());
            preparedStatement.setInt(4, employee.getDivisionId());
            preparedStatement.setString(5, employee.getBirthday());
            preparedStatement.setString(6, employee.getIdCard());
            preparedStatement.setDouble(7, employee.getSalary());
            preparedStatement.setString(8, employee.getPhone());
            preparedStatement.setString(9, employee.getEmail());
            preparedStatement.setString(10, employee.getAddress());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }



    @Override
    public Employee selectEmployee(int id) {
        Employee employee = null;
        try (Connection connection = getConnection();

             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_EMPLOYEE_BY_ID);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String name = rs.getString("employee_name");
                int positionId = rs.getInt("position_id");
                int educationDegreeId = rs.getInt("education_degree_id");
                int divisionId = rs.getInt("division_id");
                String birthday = rs.getString("birthday");
                String idCard = rs.getString("id_card");
                double salary = rs.getDouble("salary");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                String address = rs.getString("address");
                employee = new Employee(name, positionId, educationDegreeId, divisionId, birthday, idCard, salary, phone, email, address);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return employee;
    }

    @Override
    public List<Employee> selectAllEmployees() {
        List<Employee> employees = new ArrayList<>();

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_EMPLOYEE);) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("employee_id");
                String name = rs.getString("employee_name");
                int positionId = rs.getInt("position_id");
                int educationDegreeId = rs.getInt("education_degree_id");
                int divisionId = rs.getInt("division_id");
                String birthday = rs.getString("birthday");
                String idCard = rs.getString("id_card");
                double salary = rs.getDouble("salary");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                String address = rs.getString("address");
                employees.add(new Employee(id, name, positionId, educationDegreeId, divisionId, birthday, idCard, salary, phone, email, address));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return employees;
    }

    @Override
    public boolean deleteEmployee(int id) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(DELETE_EMPLOYEE_SQL);) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }

    @Override
    public boolean editEmployee(Employee employee) throws SQLException {
        boolean rowEdited;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_EMPLOYEE_SQL);) {
            statement.setString(1, employee.getEmployeeName());
            statement.setInt(2, employee.getPositionId());
            statement.setInt(3, employee.getEducationDegreeId());
            statement.setInt(4, employee.getDivisionId());
            statement.setString(5, employee.getBirthday());
            statement.setString(6, employee.getIdCard());
            statement.setDouble(7, employee.getSalary());
            statement.setString(8, employee.getPhone());
            statement.setString(9, employee.getEmail());
            statement.setString(10, employee.getAddress());

            statement.setInt(11, employee.getEmployeeId());

            rowEdited = statement.executeUpdate() > 0;
        }
        return rowEdited;
    }

    @Override
    public List<Employee> searchByName(String nameEmployee) {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_EMPLOYEE_BY_NAME);) {
            String nameSQL = nameEmployee.concat("%");
            preparedStatement.setString(1, nameSQL);
            System.out.println(preparedStatement);

            ResultSet rs = preparedStatement.executeQuery();


            while (rs.next()) {
                int id = rs.getInt("employee_id");
                String name = rs.getString("employee_name");
                int positionId = rs.getInt("position_id");
                int educationDegreeId = rs.getInt("education_degree_id");
                int divisionId = rs.getInt("division_id");
                String birthday = rs.getString("birthday");
                String idCard = rs.getString("id_card");
                double salary = rs.getDouble("salary");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                String address = rs.getString("address");
                employee = new Employee(id, name, positionId, educationDegreeId, divisionId, birthday, idCard, salary, phone, email, address);
                employeeList.add(employee);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return employeeList;
    }


    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
