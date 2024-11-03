package com.FinalExam.QLKTX.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UpdateDepartmentRequest {
    public int deprtmentId;
    public String departmentName;
    public String departmentAddess;
    public String managerPhone;
}
