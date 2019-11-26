package com.hdx.utils;

import redis.clients.jedis.Jedis;

public class JedisUtil {

    private static JedisUtil jedisUtil;

    public Jedis jedis = new Jedis();

    /**
     * 私有化构造方法
     */
    private JedisUtil(){

    }

    /**
     * 使用双重锁保证线程安全
     * 提供返回JedisUtil对象到方法
     */
    public static JedisUtil getInstance() {
        if (jedisUtil == null){
            synchronized (JedisUtil.class){
                if (jedisUtil ==null){
                    jedisUtil = new JedisUtil();
                }
            }
        }
        return jedisUtil;
    }

}
