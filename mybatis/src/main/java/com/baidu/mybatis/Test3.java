package com.baidu.mybatis;

/**
 * @Author: ghity
 * @Date: 2020/7/5 15:49
 * com.baidu.mybatis
 * jack
 */
public class Test3 {
    public static void main(String[] args) {
     int s=12;
     if (s>3){
         print1(s);
     }else{
         print2(s);
     }
    }

    private static void print2(int s) {
        System.out.println(s+"小于3");
    }

    private static void print1(int s) {

        System.out.println(s+"大于3");
    }
}
