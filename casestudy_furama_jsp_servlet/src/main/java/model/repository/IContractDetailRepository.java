package model.repository;



import model.bean.ContractDetail;

import java.sql.SQLException;

public interface IContractDetailRepository {
    void addContractDetail(ContractDetail contractDetail) throws SQLException;
}
