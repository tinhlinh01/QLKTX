package com.FinalExam.QLKTX.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Builder
public class DepartmentRequest {
    public  String departmentName;
    public String departmentAddess;
    public String managerPhone;
}
