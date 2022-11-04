package com.example.bloglogin.service.serviceImpl;

import com.example.bloglogin.Dao.UserDao;
import com.example.bloglogin.domain.User;
import com.example.bloglogin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findByUsernameAndPassword(String username, String password) {
        return userDao.findByUsernameAndPassword(username, password);
    }
}
