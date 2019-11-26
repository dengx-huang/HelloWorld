package com.hdx.service;

import com.hdx.bean.UserInfo;

import java.util.List;

public interface UserInfoService {
    String addUser(UserInfo userInfo);
    List<UserInfo> getUsers();
    UserInfo getUserById(String userId);

}
