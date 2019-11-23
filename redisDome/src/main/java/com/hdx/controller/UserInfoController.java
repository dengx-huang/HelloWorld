package com.hdx.controller;

import com.hdx.bean.UserInfo;
import com.hdx.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.mybatis.mapper.util.StringUtil;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/userInfo")
public class UserInfoController {
    Logger logger = LoggerFactory.getLogger(UserInfoController.class);


    @Resource
    private UserInfoService userInfoService;

    @RequestMapping("/addUser")
    @ResponseBody
    public String addUserInfo(HttpServletRequest request, HttpServletResponse response){
        request.getParameter("");

        return "";
    }

    @RequestMapping("/getUser")
    @ResponseBody
    public UserInfo getUserInfo(String userId){
        System.out.println("userId="+userId);
        UserInfo userInfo = userInfoService.getUserById();
        if (userInfo == null){
            System.out.println("--------->>controller userInfo is null!");
            return null;
        }
        return userInfo;
    }

    @RequestMapping("/getUsers")
    @ResponseBody
    public List<UserInfo> getUserInfoAll(){
        logger.info("----------查询所有用户信息----------");
        List<UserInfo> userInfoList = userInfoService.getUsers();
        if (userInfoList.size()<1){
            logger.info("------------未查询到用户信息------------");
        }
        return userInfoList;
    }

}
