package model.service;

import model.bean.Service;

import java.sql.SQLException;
import java.util.List;

public interface IServiceService {
    void addService(Service service) throws SQLException;

    List<Service> selectAllServices();
}
