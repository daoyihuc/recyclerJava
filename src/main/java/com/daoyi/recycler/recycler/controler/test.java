/*
 * @Descripttion: 
 * @version: 
 * @@Company: DCIT-SH
 * @Author: daoyi(yanwen)
 * @Date: 2020-11-20 14:08:13
 * @LastEditors: daoyi
 * @LastEditTime: 2020-11-20 15:04:39
 */
package com.daoyi.recycler.recycler.controler;

import java.util.HashMap;
import java.util.Map;

import com.daoyi.recycler.recycler.BaseConstans.BaseMessageBean;
import com.daoyi.recycler.recycler.Bean.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试控制器
 * @author: daoyi(yanwen)
 * */ 

@Controller
public class test {

    @Autowired
    BaseMessageBean bean;

    // 访问主页方法
    @ResponseBody
    @RequestMapping(path = "/login",method = RequestMethod.POST)
    public Object login(Login loginBean){

        return loginBean;
    }
}
