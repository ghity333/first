package com.baidu;

/**
 * @Author: ghity
 * @Date: 2020/7/4 10:40
 * com.baidu
 * jack
 */
public class Test1 {
    public static void main(String[] args) {
        people people = new people();
        people.add();
        int a=100;
        see(a);
    }
    public static void see(int i){
        for (int i1 = 0; i1 < i; i1++) {
            System.out.println(i1);
        }
    }
}
