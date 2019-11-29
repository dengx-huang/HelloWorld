package com.demo.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    private final static String DATE_TYPE1 = "yyyy-MM-dd hh:mm:ss";
    private final static String DATE_TYPE2 = "hh:mm:ss yyyy-MM-dd";
    private final static String DATE_TYPE3 = "yyyy.MM.dd hh:mm:ss";

    public static String getDateType1(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_TYPE1);
        return sdf.format(date);
    }


}
