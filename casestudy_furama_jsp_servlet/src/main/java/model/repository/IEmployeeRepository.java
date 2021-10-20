package model.repository;


import model.bean.Employee;

import java.sql.SQLException;
import java.util.List;

public interface IEmployeeRepository {
    void addEmployee(Employee employee) throws SQLException;

    Employee selectEmployee(int id);

    List<Employee> selectAllEmployees();

    boolean deleteEmployee(int id) throws SQLException;

    boolean editEmployee(Employee employee) throws SQLException;

    List<Employee> searchByName(String nameEmployee);
}
