package com.baidu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: ghity
 * @Date: 2020/7/5 21:32
 * com.baidu
 * jack
 */
public class Test11 {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("hello");
        list.add("jagghhg");
        list.add("jagghhg");
        list.add("jagghhg");
        list.add("jagghhg");
        list.add("jagghhg");
        list.add("jagghhg");
        list.add(null);
        list.add(null);
        /*for (String s : list) {
            System.out.println(s);
        }*/
       /* Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
