package com.daoyi.recycler.recycler.Bean;


/*
 * @Descripttion: 
 * @version: 
 * @@Company: DCIT-SH
 * @Author: daoyi(yanwen)
 * @Date: 2020-11-20 14:36:46
 * @LastEditors: daoyi
 * @LastEditTime: 2020-11-20 14:38:04
 */

public class Login {
    
    String name; // 名称
    String pass; // 密码
    String code; // 验证码

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    
}
