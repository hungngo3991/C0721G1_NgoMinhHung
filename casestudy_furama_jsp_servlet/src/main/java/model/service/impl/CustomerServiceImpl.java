package model.service.impl;

import model.bean.Customer;
import model.repository.impl.CustomerRepositoryImpl;
import model.service.ICustomerService;

import java.sql.SQLException;
import java.util.List;

public class CustomerServiceImpl implements ICustomerService {

    CustomerRepositoryImpl customerRepository = new CustomerRepositoryImpl();

    @Override
    public void addCustomer(Customer customer) throws SQLException {
        customerRepository.addCustomer(customer);
    }

    @Override
    public Customer selectCustomer(int id) {
        return customerRepository.selectCustomer(id);
    }

    @Override
    public List<Customer> selectAllCustomers() {
        return customerRepository.selectAllCustomers();
    }

    @Override
    public boolean deleteCustomer(int id) throws SQLException {
        return customerRepository.deleteCustomer(id);
    }

    @Override
    public boolean editCustomer(Customer customer) throws SQLException {
        return customerRepository.editCustomer(customer);
    }

    @Override
    public List<Customer> searchByName(String nameCustomer) {
        return customerRepository.searchByName(nameCustomer);
    }
}
