package com.baidu;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.Random;
import java.util.UUID;

/**
 * @Author: ghity
 * @Date: 2020/7/5 21:16
 * com.baidu
 * jack
 */
public class Test8 {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(1000);
        System.out.println(i);
        String string = UUID.randomUUID().toString();
        System.out.println(string);
        int []arr={1,2,2,3,3,1,2,3,32,2,334};
        Arrays.sort(arr);
        for (int i1 : arr) {
            System.out.println(i1);

        }
    }
}
