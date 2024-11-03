package com.FinalExam.QLKTX.controller;

import com.FinalExam.QLKTX.dto.request.RoomRequest;
import com.FinalExam.QLKTX.dto.request.UpdateRoomRequest;
import com.FinalExam.QLKTX.entity.Room;
import com.FinalExam.QLKTX.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {
    @Autowired
    private RoomService roomService;

    @GetMapping("/getAllRoom")
    private List<Room> getAllRoom(){
        return roomService.getAll();
    }

    @PostMapping("/createRoom")
    private Room createRoom(@RequestBody RoomRequest request){
        return roomService.createRoom(request);
    }

    @PutMapping("/update")
    private Room updateRoom(@RequestBody UpdateRoomRequest request){
        return roomService.updateRoom(request);
    }

    @DeleteMapping("/Delete")
    private String delete(@RequestParam("id") int id){
        return roomService.deleteRoom(id);
    }
}
