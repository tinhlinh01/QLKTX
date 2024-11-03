package com.FinalExam.QLKTX.service;

import com.FinalExam.QLKTX.dto.request.RoomRequest;
import com.FinalExam.QLKTX.entity.Room;
import com.FinalExam.QLKTX.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    public List<Room> getAll(){
        return roomRepository.findAll();
    }

    public Room createRoom(RoomRequest request){
        return roomRepository.save(Room.builder()
                        .roomName(request.getRoomName())
                        .slot(request.getSlot())
                        .active(true)
                .build());
    }
}
