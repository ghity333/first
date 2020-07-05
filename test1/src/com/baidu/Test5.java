package com.baidu;

/**
 * @Author: ghity
 * @Date: 2020/7/5 16:29
 * com.baidu
 * jack
 */
public class Test5 {
    public static void main(String[] args) {
        int s=100;
       // printArr(s);
       // printArr2(s);
        pringArr3(s);
    }

    private static void pringArr3(int s) {
        do {
            System.out.println(s);
            s--;
        }while (s>0);
    }

    private static void printArr2(int s) {
        while (s>0){
            System.out.println(s);
            s--;
        }
    }

    private static void printArr(int s) {
        for (int i = 0; i < s; i++) {
            System.out.println(i);
        }
    }

}
