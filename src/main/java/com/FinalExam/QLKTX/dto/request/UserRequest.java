package com.FinalExam.QLKTX.dto.request;

import jakarta.persistence.Column;

public class UserRequest {
    private String username;
    private String password;
    private String avatar;
    private String dob;
    private String country;
    private String phoneNumber;
    private boolean active;
}
