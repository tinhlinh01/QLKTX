package com.FinalExam.QLKTX.service;

import com.FinalExam.QLKTX.dto.request.DepartmentRequest;
import com.FinalExam.QLKTX.dto.request.UpdateDepartmentRequest;
import com.FinalExam.QLKTX.entity.Department;
import com.FinalExam.QLKTX.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getAll(){
        return departmentRepository.findAll();
    }

    public Department createDepartment(DepartmentRequest request){
        Department department = new Department();

        department.setDepartmentName(request.getDepartmentName());
        department.setDepartmentAddress(request.getDepartmentAddess());
        department.setManagerPhone(request.getManagerPhone());

        return departmentRepository.save(department);
    }

    public Department updateDepartment(UpdateDepartmentRequest request){
        Department department = departmentRepository.findById(request.deprtmentId).orElseThrow(()->new RuntimeException());

        department.setDepartmentName(department.getDepartmentName());
        department.setDepartmentAddress(department.getDepartmentAddress());
        department.setManagerPhone(department.getManagerPhone());

        return departmentRepository.save(department);
    }

     public String deleteDepartment(int id){
        departmentRepository.deleteById(id);
        return "Thành công";
     }
}
