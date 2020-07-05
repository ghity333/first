package com.baidu;

/**
 * @Author: ghity
 * @Date: 2020/7/5 16:26
 * com.baidu
 * jack
 */
public class Test4 {
    public static void main(String[] args) {
        int s=123;
       boolean dd= caseTest(s);
        System.out.println(dd);
    }

    private static boolean caseTest(int s) {
        switch (s){
            case 12:
                return true;
            default:
                return false;
        }
    }
}
