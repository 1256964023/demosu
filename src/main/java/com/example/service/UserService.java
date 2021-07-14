package com.example.service;

import com.example.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

/**
 * @version 1.0
 * @author: qiqi
 * @date: 2021/7/9 19:00
 * @desc:
 */

public interface UserService {
    public ArrayList<User> selectUsers();//查询所有用户返回集合
    public User selectUser(@Param("acc")String acc, @Param("pass") String pass);//查询用户是否存在
    public int insertUser(User user);//用户注册

}
