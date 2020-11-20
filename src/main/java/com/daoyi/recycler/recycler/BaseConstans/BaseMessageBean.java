/*
 * @Descripttion: 公共消息组件
 * @version: 
 * @@Company: DCIT-SH
 * @Author: daoyi(yanwen)
 * @Date: 2020-11-20 14:23:49
 * @LastEditTime: 2020-11-20 14:35:33
 */
package com.daoyi.recycler.recycler.BaseConstans;

import org.springframework.stereotype.Component;

@Component
public class BaseMessageBean {
    
    public String msg; // 消息
    public int code;  // 状态码
    public Object data;// 详细数据

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    
    
}
