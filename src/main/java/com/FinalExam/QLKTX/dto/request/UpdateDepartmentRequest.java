package com.FinalExam.QLKTX.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UpdateDepartmentRequest {
    public int departmentId;
    public String departmentName;
    public String departmentAddess;
    public String managerPhone;
}
