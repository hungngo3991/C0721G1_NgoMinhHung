package model.service;

import model.bean.ContractDetail;

import java.sql.SQLException;

public interface IContractDetailService {
    void addContractDetail(ContractDetail contractDetail) throws SQLException;
}
