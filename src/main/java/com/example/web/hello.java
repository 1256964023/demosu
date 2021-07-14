package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @version 1.0
 * @author: qiqi
 * @date: 2021/7/8 16:07
 * @desc:
 */

//@Controller//控制层
//@RequestMapping("/admin")//路径
public class hello {

//    @RequestMapping("/heo")
//    public String hello(){
//        System.out.println("进来了login");
//
//        return "login";
//    }

//
//    @RequestMapping("/HelloGo")
//    public String HelloGo(
//            @RequestParam(value = "acc",required = true,defaultValue = "AAA") String acc, String pass){
//        System.out.println("进来了");
//        System.out.println(acc);
//        System.out.println(pass);
//        return "login";
//    }
//    @RequestMapping("/login")
//    public String login(String acc,String pass){
//        System.out.println("登录");
//        if (acc.equals("123456")&&pass.equals("123456")){
//        return "HelloWord";
//        }
//     return null;
//    }

    //ajax测试
//    @RequestMapping(value = "/login",method = RequestMethod.POST,produces ="text/html;charset=UTF-8")
//    @PostMapping("/log")//dopost请求
//    public   @ResponseBody String login(
//             String acc,   String pass){
//
//        System.out.println("登录");
//        System.out.println(acc);
//        System.out.println(pass);
//            return "55555";
//
//    }
}
