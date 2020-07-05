package com.baidu;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: ghity
 * @Date: 2020/7/5 16:50
 * com.baidu
 * jack
 */
public class Test7 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);

    }
}
