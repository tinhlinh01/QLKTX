package com.FinalExam.QLKTX.service;

import com.FinalExam.QLKTX.entity.Contract;
import com.FinalExam.QLKTX.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractService {
    @Autowired
    private ContractRepository contractRepository;

    public Contract getContractById(int id) {
        return contractRepository.findById(id).get();
    }

    public List<Contract> getAll() {
        return contractRepository.findAll();
    }

    public Contract createContract(Contract contract) {
        return contractRepository.save(contract);
    }

    public Contract updateContract(Contract contract) {
        return contractRepository.save(contract);
    }
}
