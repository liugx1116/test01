package com.at.jd.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ArrayTest {

    public static void main(String[] args) {
//        Date oldTime = new Date(){};
//
//        if(1 == 1){
//            Date startDate = new Date(20211014);
//            Date endDate = new Date(20221013);
//            oldTime = new Date(){};
        Date startDate = new Date();
//        Date endDate = new Date(2021,10,21);
        //2015,10,21
        Calendar calendar = Calendar.getInstance();
        calendar.set(2015,10,21);
        Date time = calendar.getTime();
        String strDateFormat = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        System.out.println(sdf.format(startDate));
        System.out.println(sdf.format(time));
            System.out.println("测试呀");
        }
}
