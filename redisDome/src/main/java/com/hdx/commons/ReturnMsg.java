package com.hdx.commons;

import java.util.List;

public class ReturnMsg<E> {
    private String code;
    private String massage;
    private List<E> list;


    public ReturnMsg(String code, String massage, List<E> list) {
        this.code = code;
        this.code = massage;
        this.list = list;
    }

    public ReturnMsg(String code, String massage) {
        this.code = code;
        this.massage = massage;
    }

    public String retMsg() {
        return "code:" + code + ",massage:" + massage;
    }

    public List<E> retList(){
        return list;
    }

}
