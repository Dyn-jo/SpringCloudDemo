package com.dyn.demo.study.javabasic;

/**
 * 1.自增变量
 */
public class Test1 {

    public static void main(String[] args) {
        int i = 1;
        i = i++;
        int j = i++;
        int k = i + ++i * i++;
        System.out.println(i + "," + j + "," + k);
    }
}
