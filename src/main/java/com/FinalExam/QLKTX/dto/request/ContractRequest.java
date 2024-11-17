package com.FinalExam.QLKTX.dto.request;

import com.FinalExam.QLKTX.entity.Department;
import com.FinalExam.QLKTX.entity.Room;
import com.FinalExam.QLKTX.entity.User;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ContractRequest {
    private int contractId;
    private String startDate;
    private String endDate;
    private float price;
    private float deposit;
    private Department department;
    private Room room;
    private User user;
    private String description;
}
