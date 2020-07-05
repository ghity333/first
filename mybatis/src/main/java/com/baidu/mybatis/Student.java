package com.baidu.mybatis;

/**
 * @Author: ghity
 * @Date: 2020/7/5 15:45
 * com.baidu.mybatis
 * jack
 */
public class Student implements People {
    private String name;
    public Student(String name){
        this.name=name;
    }
    public void eat() {
        System.out.println("Student eat");
    }

    public void work() {
        System.out.println(name+"study");
    }
}
