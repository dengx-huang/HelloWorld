package com.hdx.service.impl;

import com.hdx.bean.UserInfo;
import com.hdx.dao.UserInfoMapper;
import com.hdx.service.UserInfoService;
import com.hdx.utils.JedisUtil;
import com.hdx.utils.JsonUtil;
import com.hdx.utils.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Component
@Service
public class UserInfoServiceImpl implements UserInfoService {
    Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public String addUser(UserInfo userInfo) {
        if (StringUtils.isEmpty(userInfo.getUserId())) {
            logger.info("前端未传送用户ID！将自动生成ID！");
            userInfo.setUserId(UUID.randomUUID().toString());
        }
        if (StringUtils.isEmpty(userInfo.getPwd())) {
            userInfo.setPwd("123");
        }

        JedisUtil jedisUtil = JedisUtil.getInstance();
        Jedis jedis = jedisUtil.jedis;
        if (!StringUtils.isEmpty(jedis.get(userInfo.getUserId()))){
            return "error";
        }
        UserInfo userInfo1 = userInfoMapper.selectById(userInfo.getUserId());
        if (!ObjectUtils.isEmpty(userInfo1)){
            return "error";
        }

        jedis.set(userInfo.getUserId(), userInfo.toString());
        int count = userInfoMapper.insertUserInfo(userInfo);
        if (count <= 0) {
            logger.info("--新增用户失败--");
            return "error";
        }
        logger.info("redis:------>>>>>"+jedis.get(userInfo.getUserId()));
        return "success";
    }

    @Override
    public List<UserInfo> getUsers() {



        return userInfoMapper.selectAll();
//        return null;
    }

    @Override
    public UserInfo getUserById(String userId) {
        Jedis jedis = JedisUtil.getInstance().jedis;
        String str = jedis.get(userId);
        if (!StringUtils.isEmpty(str)){
            logger.info("--->>:从redis中查询到该数据!");
            UserInfo userInfo = JsonUtil.jsonToBean(str, UserInfo.class);
            return userInfo;
        }

        UserInfo userInfo = userInfoMapper.selectById(userId);
        if (userInfo == null) {
            logger.info("----------没有查询到相关数据------------");
            return null;
        }
        logger.info("--->>:将查询到到用户信息保存到redis中！");
        jedis.set(userId, userInfo.toString());
        return userInfo;
    }
}
