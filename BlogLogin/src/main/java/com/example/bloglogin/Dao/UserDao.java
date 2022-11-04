package com.example.bloglogin.Dao;

import com.example.bloglogin.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserDao extends JpaRepository<User, Integer> {


    List<User> findByUsernameAndPassword(@Param("username") String username,
                                         @Param("password") String password);
}
