package com.FinalExam.QLKTX.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateRoomRequest {
    private int id;
    private String roomName;
    private int slot;
}
