package com.baisu.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: ghity
 * @Date: 2020/7/4 11:50
 * com.baisu.spring
 * jack
 */
public class Test4 {
    public static void main(String[] args) {
        ApplicationContext ap=new ClassPathXmlApplicationContext("bean.xml");
        Room room = ap.getBean("room", Room.class);
        String man = room.getName();
        System.out.println(man
        );
    }
}
