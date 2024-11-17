package com.FinalExam.QLKTX.service;

import com.FinalExam.QLKTX.dto.request.RoomRequest;
import com.FinalExam.QLKTX.dto.request.UpdateRoomRequest;
import com.FinalExam.QLKTX.entity.Room;
import com.FinalExam.QLKTX.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Room updateRoom(UpdateRoomRequest request){
        Room room = roomRepository.findById(request.getId()).orElseThrow(()->new RuntimeException());

        room.setRoomName(request.getRoomName());
        room.setSlot(request.getSlot());

       return roomRepository.save(room);
    }

    public String deleteRoom(int id){
        Room room = roomRepository.findById(id).orElseThrow(()->new RuntimeException());
        room.setActive(false);
        roomRepository.save(room);
        return "Thành công";
    }
}
