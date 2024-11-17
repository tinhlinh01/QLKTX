package com.FinalExam.QLKTX.repository;

import com.FinalExam.QLKTX.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
