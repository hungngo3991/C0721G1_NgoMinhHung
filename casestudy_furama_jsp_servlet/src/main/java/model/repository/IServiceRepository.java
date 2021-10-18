package model.repository;


import model.bean.Service;

import java.sql.SQLException;
import java.util.List;

public interface IServiceRepository {
    void addService(Service service) throws SQLException;

    List<Service> selectAllServices();
}
