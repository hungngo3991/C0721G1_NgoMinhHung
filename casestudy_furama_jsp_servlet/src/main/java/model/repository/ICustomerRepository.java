package model.repository;

import model.bean.Customer;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerRepository {
    void addCustomer(Customer customer) throws SQLException;

    Customer selectCustomer(int id);

    List<Customer> selectAllCustomers();

    boolean deleteCustomer(int id) throws SQLException;

    boolean editCustomer(Customer customer) throws SQLException;

    List<Customer> searchByName(String nameCustomer);
}
