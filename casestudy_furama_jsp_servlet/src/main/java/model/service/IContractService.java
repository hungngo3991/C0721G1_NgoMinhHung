package model.service;

import model.bean.Contract;

import java.sql.SQLException;
import java.util.List;

public interface IContractService {
    void addContract(Contract contract) throws SQLException;

    List<Contract> selectAllContracts();
}
