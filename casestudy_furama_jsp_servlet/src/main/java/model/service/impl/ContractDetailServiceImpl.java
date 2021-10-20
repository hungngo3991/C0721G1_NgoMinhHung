package model.service.impl;

import model.bean.ContractDetail;
import model.repository.impl.ContractDetailRepositoryImpl;

import model.service.IContractDetailService;

import java.sql.SQLException;

public class ContractDetailServiceImpl implements IContractDetailService {

    ContractDetailRepositoryImpl contractDetailRepository = new ContractDetailRepositoryImpl();

    @Override
    public void addContractDetail(ContractDetail contractDetail) throws SQLException {
            contractDetailRepository.addContractDetail(contractDetail);
    }
}
