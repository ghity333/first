package com.baidu;

/**
 * @Author: ghity
 * @Date: 2020/7/5 21:24
 * com.baidu
 * jack
 */
public class Test9 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(12);
        student.setName("jack");
        Student.classNum=12;
        System.out.println(student);
        student.study();
    }
}
