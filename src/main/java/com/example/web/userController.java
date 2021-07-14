package com.example.web;

import com.example.bean.User;
import com.example.service.UserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

/**
 * @version 1.0
 * @author: qiqi
 * @date: 2021/7/9 16:43
 * @desc:
 */
@Controller
@RequestMapping("/userController")
public class userController {
    @RequestMapping("/lo")
    public String lo (){
        return "log";
    }


    @Autowired
    UserService userService;

    private Gson gson = new Gson();


    @PostMapping("/log")//dopost请求
    @ResponseBody//设置返回为json
    public String login (String acc,String pass){
        User user = userService.selectUser(acc,pass);
        System.out.println("用户"+user);
        String log;
        if (user!=null){
            log = "logTrue";
            return log ;
        }else {
            log = "logFalse";
            return log;
        }
    }


//    @RequestMapping(value="/reg",method= RequestMethod.POST,produces="text/html;charset=UTF-8")
    @PostMapping(value = "/reg",produces="application/json")//dopost请求
    @ResponseBody//设置返回为json

    public String reg (String user){
        Gson gson = new Gson();
        User user1 = gson.fromJson(user,User.class);//转换成对象
        int num = userService.insertUser(user1);
        System.out.println("注册"+user1);
        String reg;
        if (num>0){
            reg = "regTrue";
            return reg ;
        }else {
            reg = "regFalse";
            return reg;
        }
    }

    @RequestMapping(value="/selectUsers",method= RequestMethod.POST,produces="text/html;charset=UTF-8")
    @ResponseBody//设置返回为json
    public String selectUsers(){//查询所有用户的方法

        ArrayList<User> users = userService.selectUsers();

        return gson.toJson(users);
    }


}
