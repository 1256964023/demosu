package com.example.mapper;

import com.example.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * @version 1.0
 * @author: qiqi
 * @date: 2021/7/6 20:50
 * @desc:
 */
@Repository
public interface UserMapper {
    public ArrayList<User>selectUsers();//查询所有用户返回集合
    public User selectUser(@Param("acc")String acc, @Param("pass") String pass);//查询用户是否存在
    public int insertUser(User user);//用户注册
}
