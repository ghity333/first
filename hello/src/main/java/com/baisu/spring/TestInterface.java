package com.baisu.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: ghity
 * @Date: 2020/7/4 11:10
 * com.baisu.spring
 * jack
 */
public class TestInterface {
    public static void main(String[] args) {
        ApplicationContext ap=new ClassPathXmlApplicationContext("bean.xml");
        People people = ap.getBean("people", People.class);
        people.see();
    }
}
