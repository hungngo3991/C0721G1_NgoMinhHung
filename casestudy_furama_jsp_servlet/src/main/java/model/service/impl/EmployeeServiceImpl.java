package model.service.impl;

import model.bean.Employee;

import model.repository.impl.EmployeeRepositoryImpl;
import model.service.IEmployeeService;

import java.sql.SQLException;
import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {

    EmployeeRepositoryImpl employeeRepository = new EmployeeRepositoryImpl();

    @Override
    public void addEmployee(Employee employee) throws SQLException {
        employeeRepository.addEmployee(employee);
    }

    @Override
    public Employee selectEmployee(int id) {
        return employeeRepository.selectEmployee(id);
    }

    @Override
    public List<Employee> selectAllEmployees() {
        return employeeRepository.selectAllEmployees();
    }

    @Override
    public boolean deleteEmployee(int id) throws SQLException {
        return employeeRepository.deleteEmployee(id);
    }

    @Override
    public boolean editEmployee(Employee employee) throws SQLException {
        return employeeRepository.editEmployee(employee);
    }

    @Override
    public List<Employee> searchByName(String nameEmployee) {
        return employeeRepository.searchByName(nameEmployee);
    }
}
