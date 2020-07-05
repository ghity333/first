package com.baidu;

/**
 * @Author: ghity
 * @Date: 2020/7/5 21:23
 * com.baidu
 * jack
 */
public class Student {
    public static   int classNum ;
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public void study(){
        System.out.println("study");
    }


}
