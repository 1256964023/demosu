package com.example.service.Impl;

import com.example.bean.User;
import com.example.mapper.UserMapper;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @version 1.0
 * @author: qiqi
 * @date: 2021/7/9 19:01
 * @desc:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public ArrayList<User> selectUsers() {
        ArrayList<User> users =userMapper.selectUsers();
        return users;

    }

    @Override
    public User selectUser(String acc, String pass) {
        User user = userMapper.selectUser(acc,pass);
        return user;
    }

    @Override
    public int insertUser(User user) {
        int num =  userMapper.insertUser(user);
        return num;
    }
}
