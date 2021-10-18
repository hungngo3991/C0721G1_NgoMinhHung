package model.service.impl;

import model.bean.Service;
import model.repository.impl.ServiceRepositoryImpl;
import model.service.IServiceService;

import java.sql.SQLException;
import java.util.List;

public class ServiceServiceImpl implements IServiceService {


    ServiceRepositoryImpl serviceRepository = new ServiceRepositoryImpl();

    @Override
    public void addService(Service service) throws SQLException {
            serviceRepository.addService(service);
    }

    @Override
    public List<Service> selectAllServices() {
        return serviceRepository.selectAllServices();
    }
}
