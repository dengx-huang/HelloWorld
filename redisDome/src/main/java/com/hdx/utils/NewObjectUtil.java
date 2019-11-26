package com.hdx.utils;

import com.hdx.bean.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public class NewObjectUtil {
    private static Logger logger = LoggerFactory.getLogger(NewObjectUtil.class);

    public static UserInfo getUserInfo(HttpServletRequest request) {
        UserInfo userInfo = new UserInfo();
        Map<String, String[]> map = request.getParameterMap();
        for (String key : map.keySet()) {
            switch (key) {
                case "userId":
                    userInfo.setUserId(map.get(key)[0]);
                    break;
                case "userName":
                    userInfo.setUserName(map.get(key)[0]);
                    break;
                case "userAge":
                    userInfo.setUserAge(Integer.valueOf(map.get(key)[0]));
                    break;
                case "pwd":
                    userInfo.setPwd(map.get(key)[0]);
                    break;
                default:
                    break;
            }

        }
        logger.info("前端传送数据：【{}】", userInfo.toString());

        return userInfo;
    }

}
