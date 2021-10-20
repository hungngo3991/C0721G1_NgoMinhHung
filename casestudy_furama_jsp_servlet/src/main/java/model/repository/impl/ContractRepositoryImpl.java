package model.repository.impl;

import model.bean.Contract;
import model.bean.Service;
import model.repository.IContractRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContractRepositoryImpl implements IContractRepository {

    private String jdbcURL = "jdbc:mysql://localhost:3306/furama_resort?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "869357984756";

    private static final String INSERT_CONTRACT_SQL = "INSERT INTO contract (employee_id, customer_id, service_id, contract_start_date," +
            " contract_end_date, deposit, total_money) VALUES (?, ?, ?, ?, ?, ?, ?);";
    private static final String SELECT_ALL_CONTRACT = "SELECT * FROM contract";


    public ContractRepositoryImpl() {
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
    public void addContract(Contract contract) throws SQLException {
        System.out.println(INSERT_CONTRACT_SQL);
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CONTRACT_SQL)) {
            preparedStatement.setInt(1, contract.getEmployeeId());
            preparedStatement.setInt(2, contract.getCustomerId());
            preparedStatement.setInt(3, contract.getServiceId());
            preparedStatement.setString(4, contract.getContractStartDate());
            preparedStatement.setString(5, contract.getContractEndDate());
            preparedStatement.setDouble(6, contract.getDeposit());
            preparedStatement.setDouble(7, contract.getTotalMoney());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }



    @Override
    public List<Contract> selectAllContracts() {
        List<Contract> contracts = new ArrayList<>();

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CONTRACT);) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("contract_id");
                int employeeId = rs.getInt("employee_id");
                int customerId = rs.getInt("customer_id");
                int serviceId = rs.getInt("service_id");
                String contractStartDate = rs.getString("contract_start_date");
                String contractEndDate = rs.getString("contract_end_date");
                double deposit = rs.getDouble("deposit");
                double totalMoney = rs.getDouble("total_money");
                contracts.add(new Contract(id, employeeId, customerId, serviceId, contractStartDate, contractEndDate, deposit, totalMoney));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return contracts;
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
