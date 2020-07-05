package com.baidu;

/**
 * @Author: ghity
 * @Date: 2020/7/5 21:53
 * com.baidu
 * jack
 */
public class TestImpl {
    public static  void test(Interfaceq interfaceq){
        interfaceq.eat();
    }

    public static void main(String[] args) {
        test(new Impl1());
        test(new Impl2());
    }
}
