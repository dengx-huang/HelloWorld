package com.hdx.service.impl;

import com.hdx.bean.UserInfo;
import com.hdx.dao.UserInfoMapper;
import com.hdx.service.UserInfoService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Component
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public void addUser() {

    }

    @Override
    public List<UserInfo> getUsers() {
        return userInfoMapper.selectAll();
//        return null;
    }

    @Override
    public UserInfo getUserById() {
        UserInfo userInfo = userInfoMapper.selectById("001");
        System.out.println("---------------------------------------------");
        if (userInfo == null){
            return null;
        }
        System.out.println(userInfo.toString());
        return userInfo;
    }
}
