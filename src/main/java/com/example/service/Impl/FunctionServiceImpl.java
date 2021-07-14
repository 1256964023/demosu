package com.example.service.Impl;

import com.example.bean.Function;
import com.example.mapper.FunctionMapper;
import com.example.service.FunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @version 1.0
 * @author: qiqi
 * @date: 2021/7/12 9:25
 * @desc:
 */
@Service
public class FunctionServiceImpl implements FunctionService {


    @Autowired
    FunctionMapper functionMapper;

    @Override
    public ArrayList<Function> selectAll() {
        ArrayList<Function>functions = functionMapper.selectAll();
        return functions;
    }
}
