package com.FinalExam.QLKTX.controller;

import com.FinalExam.QLKTX.dto.request.DepartmentRequest;
import com.FinalExam.QLKTX.dto.request.UpdateDepartmentRequest;
import com.FinalExam.QLKTX.entity.Department;
import com.FinalExam.QLKTX.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/getAllDepartment")
    private List<Department> getAll(){
        return departmentService.getAll();
    }

    @PostMapping("/create")
    private Department createDepartment(@RequestBody DepartmentRequest request){
        return departmentService.createDepartment(request);
    }

    @PutMapping("/update")
    private Department updateDepartment(@RequestBody UpdateDepartmentRequest request){
        return departmentService.updateDepartment(request);
    }

    @DeleteMapping("/delete")
    private String deleteDepartment(@RequestParam("id") int id){
        return departmentService.deleteDepartment(id);
    }
}
