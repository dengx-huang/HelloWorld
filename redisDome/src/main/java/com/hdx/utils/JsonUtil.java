package com.hdx.utils;


import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class JsonUtil {
    Logger logger = LoggerFactory.getLogger(JsonUtil.class);

    public static JSONObject strToJSON(String str) {
        JSONObject json = JSONObject.parseObject(str);
        return json;
    }

    public static <T> T jsonToBean(String str, Class<T> clazz) {
        T obj = (T) JSONObject.parseObject(str, clazz);
        return obj;
    }

    public static <T> T toJavaObject(JSONObject json, Class<T> clazz) {
        T obj = JSONObject.toJavaObject(json,clazz);
        return obj;
    }
}
