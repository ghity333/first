package com.baidu.mybatis;

import java.io.IOException;

/**
 * @Author: ghity
 * @Date: 2020/7/5 15:14
 * com.baidu.mybatis
 * jack
 */
public class Mybatis {
    public static void main(String[] args) throws IOException {
       int[]arr={1,12,3,33,3,3};
        for (int i : arr) {
            System.out.println(i);
        }
        User[]users=new User[10];
        addUsers(users);
        for (User user : users) {
            System.out.println(user);
        }
        String []arr1=new String[5];
        addStrs(arr1);
        for (String s : arr1) {
            System.out.println(s);

        }
    }

    private static void addStrs(String[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]="jacksksk"+i;
        }
    }

    private static void addUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            users[i]=new User(i,"jack"+i);
        }
    }

}
