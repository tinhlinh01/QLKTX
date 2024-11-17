package com.FinalExam.QLKTX.controller;

import com.FinalExam.QLKTX.entity.Contract;
import com.FinalExam.QLKTX.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contract")
public class ContractController {

    @Autowired
    private ContractService contractService;

    @GetMapping("/getAllContract")
    private List<Contract> getAllContract(){
        return contractService.getAll();
    }

    @GetMapping("/getAllContract/{id}")
    private Contract getContractById(@PathVariable int id){
        return contractService.getContractById(id);
    }

    @PostMapping("/createContract")
    private Contract createContract(@RequestBody Contract contract){
        return contractService.createContract(contract);
    }

    @PutMapping("/updateContract")
    private Contract updateContract(@RequestBody Contract contract){
        return contractService.updateContract(contract);
    }

}
