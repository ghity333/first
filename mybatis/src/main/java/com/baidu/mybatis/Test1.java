package com.baidu.mybatis;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @Author: ghity
 * @Date: 2020/7/5 15:38
 * com.baidu.mybatis
 * jack
 */
public class Test1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        System.out.println(Dog.IP);
        dog.run();
    }
}
