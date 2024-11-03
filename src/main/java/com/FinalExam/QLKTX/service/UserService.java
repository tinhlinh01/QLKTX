package com.FinalExam.QLKTX.service;

import com.FinalExam.QLKTX.entity.User;
import com.FinalExam.QLKTX.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService
{
    private UserRepository userRepository;
    public List<User>getAll(){ return userRepository.findAll(); }

}
