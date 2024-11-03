package com.FinalExam.QLKTX.controller;

import com.FinalExam.QLKTX.dto.request.RoomRequest;
import com.FinalExam.QLKTX.dto.request.UserRequest;
import com.FinalExam.QLKTX.entity.Room;
import com.FinalExam.QLKTX.entity.User;
import com.FinalExam.QLKTX.service.RoomService;
import com.FinalExam.QLKTX.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getAllUser")
    private List<User> getAllUser(){
        return userService.getAll();
    }

//    @PostMapping("/createUser")
//    private User createUser(@RequestBody UserRequest request){
//        return userService.createUser(request);
//    }
}
