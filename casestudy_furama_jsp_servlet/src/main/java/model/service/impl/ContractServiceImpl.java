package model.service.impl;

import model.bean.Contract;

import model.repository.impl.ContractRepositoryImpl;
import model.service.IContractService;

import java.sql.SQLException;
import java.util.List;

public class ContractServiceImpl implements IContractService {

    ContractRepositoryImpl contractRepository = new ContractRepositoryImpl();

    @Override
    public void addContract(Contract contract) throws SQLException {
        contractRepository.addContract(contract);
    }

    @Override
    public List<Contract> selectAllContracts() {
        return contractRepository.selectAllContracts();
    }
}
