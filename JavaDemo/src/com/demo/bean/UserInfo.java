package com.demo.bean;

import java.io.Serializable;

public class UserInfo implements Serializable {
    private String userName;
    private Integer age;
    private String addr;
    private String code;


    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
