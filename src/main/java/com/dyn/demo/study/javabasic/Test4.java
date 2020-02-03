package com.dyn.demo.study.javabasic;

import java.util.Arrays;

/**
 * 4.参数传递
 */
public class Test4 {
    public static void main(String[] args) {
        int i = 1;
        String str = "hello";
        Integer num = 200;
        int[] arr = {1, 2, 3, 4, 5};
        MyData my = new MyData();
        change(i, str, num, arr, my);
        System.out.println(i);

        System.out.println(str);
        System.out.println(num);
        System.out.println(Arrays.toString(arr));
        System.out.println(my.a);
    }

    public static void change(int i, String str, Integer num, int[] arr, MyData my) {

        i += 1;
        str += "world";
        num += 1;
        arr[0] += 1;
        my.a += 1;
    }
}

class MyData {
    int a = 10;
}