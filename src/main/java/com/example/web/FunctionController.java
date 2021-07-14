package com.example.web;

import com.example.bean.Function;
import com.example.service.Impl.FunctionServiceImpl;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

/**
 * @version 1.0
 * @author: qiqi
 * @date: 2021/7/12 9:32
 * @desc:
 */
@Controller
@RequestMapping("/FunctionController")
public class FunctionController {

    @Autowired
    FunctionServiceImpl functionService;


    private Gson gson = new Gson();

    @RequestMapping(value = "/selectAll",method = RequestMethod.GET,produces ="text/html;charset=UTF-8")
    @ResponseBody
    public String selectAll(){
        ArrayList<Function> functions = functionService.selectAll();//查询所有功能的集合
        String functList = gson.toJson(functions);
        return functList;
    }

}
