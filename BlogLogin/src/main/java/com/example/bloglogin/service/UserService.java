package com.example.bloglogin.service;

import com.example.bloglogin.domain.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface UserService {
    public List<User> findByUsernameAndPassword(String username, String password);
}
