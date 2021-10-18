package model.repository.impl;

import model.bean.Customer;
import model.repository.ICustomerRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements ICustomerRepository {

    private String jdbcURL = "jdbc:mysql://localhost:3306/furama_resort?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "869357984756";

    private static final String INSERT_CUSTOMER_SQL = "INSERT INTO customer (customer_type_id, customer_name, birthday, gender, id_card, phone, email, address ) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
    private static final String SELECT_CUSTOMER_BY_ID = "SELECT customer_id, customer_type_id, customer_name, birthday, gender, id_card, phone, email, address FROM customer WHERE customer_id = ?";
    private static final String SELECT_ALL_CUSTOMER = "SELECT * FROM customer";
    private static final String DELETE_CUSTOMER_SQL = "DELETE FROM customer WHERE customer_id = ?;";
    private static final String UPDATE_CUSTOMER_SQL = "UPDATE customer SET customer_type_id = ?,customer_name = ?, birthday = ?, gender = ?, id_card = ?, phone = ?, email = ?, address = ? WHERE customer_id = ?;";
    private static final String SELECT_CUSTOMER_BY_NAME = "SELECT customer_id, customer_type_id, customer_name, birthday, gender, id_card, phone, email, address FROM customer WHERE customer_name LIKE ?;";


    public CustomerRepositoryImpl() {
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
    public void addCustomer(Customer customer) throws SQLException {
        System.out.println(INSERT_CUSTOMER_SQL);
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CUSTOMER_SQL)) {
            preparedStatement.setInt(1, customer.getCustomerTypeID());
            preparedStatement.setString(2, customer.getCustomerName());
            preparedStatement.setString(3, customer.getBirthday());
            preparedStatement.setInt(4, customer.getGender());
            preparedStatement.setString(5, customer.getIdCard());
            preparedStatement.setString(6, customer.getPhone());
            preparedStatement.setString(7, customer.getEmail());
            preparedStatement.setString(8, customer.getAddress());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }


    @Override
    public Customer selectCustomer(int id) {
        Customer customer = null;
        try (Connection connection = getConnection();

             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_BY_ID);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int typeid = rs.getInt("customer_type_id");
                String name = rs.getString("customer_name");
                String birthday = rs.getString("birthday");
                int gender = rs.getInt("gender");
                String idcard = rs.getString("id_card");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                String address = rs.getString("address");
                customer = new Customer(typeid, name, birthday, gender, idcard, phone, email, address);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return customer;
    }

    @Override
    public List<Customer> selectAllCustomers() {

        List<Customer> customers = new ArrayList<>();

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER);) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("customer_id");
                int typeid = rs.getInt("customer_type_id");
                String name = rs.getString("customer_name");
                String birthday = rs.getString("birthday");
                int gender = rs.getInt("gender");
                String idcard = rs.getString("id_card");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                String address = rs.getString("address");
                customers.add(new Customer(id, typeid, name, birthday, gender, idcard, phone, email, address));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return customers;
    }

    @Override
    public boolean deleteCustomer(int id) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(DELETE_CUSTOMER_SQL);) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }

    @Override
    public boolean editCustomer(Customer customer) throws SQLException {
        boolean rowEdited;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_CUSTOMER_SQL);) {
            statement.setInt(1, customer.getCustomerTypeID());
            statement.setString(2, customer.getCustomerName());
            statement.setString(3, customer.getBirthday());
            statement.setInt(4, customer.getGender());
            statement.setString(5, customer.getIdCard());
            statement.setString(6, customer.getPhone());
            statement.setString(7, customer.getEmail());
            statement.setString(8, customer.getAddress());

            statement.setInt(9, customer.getCustomerID());

            rowEdited = statement.executeUpdate() > 0;
        }
        return rowEdited;
    }

    @Override
    public List<Customer> searchByName(String nameCustomer) {
        List<Customer> customerList = new ArrayList<>();
        Customer customer;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_BY_NAME);) {
            String nameSQL = nameCustomer.concat("%");
            preparedStatement.setString(1, nameSQL);
            System.out.println(preparedStatement);

            ResultSet rs = preparedStatement.executeQuery();


            while (rs.next()) {
                int id = rs.getInt("customer_id");
                int typeid = rs.getInt("customer_type_id");
                String name = rs.getString("customer_name");
                String birthday = rs.getString("birthday");
                int gender = rs.getInt("gender");
                String idcard = rs.getString("id_card");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                String address = rs.getString("address");
                customer = new Customer(id, typeid, name, birthday, gender, idcard, phone, email, address);
                customerList.add(customer);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return customerList;
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
