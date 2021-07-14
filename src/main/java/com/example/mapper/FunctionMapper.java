package com.example.mapper;

import com.example.bean.Function;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * @version 1.0
 * @author: qiqi
 * @date: 2021/7/12 9:22
 * @desc:
 */
@Repository
public interface FunctionMapper {
    public ArrayList<Function> selectAll();//查询管理员所有功能的方法
}
