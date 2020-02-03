package com.dyn.demo.study.javabasic;

/**
 * 6.成员变量与局部变量
 */
public class Test6 {
    static int s;
    int i;
    int j;

    {
        int i = 1;
        i++;
        j++;
        s++;
    }

    void test(int j) {
        j++;
        i++;
        s++;
    }

    public static void main(String[] args) {
        Test6 t1 = new Test6();
        Test6 t2 = new Test6();
        t1.test(10);
        t1.test(20);
        t2.test(30);
        System.out.println(t1.i + "," + t1.j + "," + t1.s);
        System.out.println(t2.i + "," + t2.j + "," + t2.s);
    }
}
