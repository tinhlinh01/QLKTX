package com.FinalExam.QLKTX.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class RoomRequest {
    public String roomName;
    public int slot;
}
