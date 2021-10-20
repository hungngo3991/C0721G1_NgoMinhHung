package model.repository;

import model.bean.Contract;


import java.sql.SQLException;
import java.util.List;

public interface IContractRepository {
    void addContract(Contract contract) throws SQLException;

    List<Contract> selectAllContracts();
}
