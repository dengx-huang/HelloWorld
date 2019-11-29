package com.hdx.utils;

public class ConstanUtil {
    /**
     * 私有化构造方法
     */
    private ConstanUtil(){}

    /**
     * 将对象到实例放在内部类中创建出来
     */
    private static class ConstanHolder{
        private static final ConstanUtil INSTANCE = new ConstanUtil();
    }

    /**
     * 为外部提供返回实例到方法
     * @return
     */
    public static final ConstanUtil getInstance(){
        return ConstanHolder.INSTANCE;
    }



}
