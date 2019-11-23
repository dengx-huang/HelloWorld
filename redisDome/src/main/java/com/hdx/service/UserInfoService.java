package com.hdx.service;

import com.hdx.bean.UserInfo;

import java.util.List;

public interface UserInfoService {
    void addUser();
    List<UserInfo> getUsers();
    UserInfo getUserById();

}
