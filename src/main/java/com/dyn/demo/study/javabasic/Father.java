package com.dyn.demo.study.javabasic;

/**
 * 父类的初始化<clinit>:
 * 1、j = method()
 * 2、static {}
 * <p>
 * 父类的实例化方法：
 * 1、super()
 * 2、i = test();
 * 3、构造块
 * 4、构造方法
 * <p>
 * 非静态方法的前面其实有个默认的对象this，this在构造器（或<init>）表示正在创建的对象
 */
public class Father {
    private int i = test();
    private static int j = method();

    static {
        System.out.print("1 ");
    }

    Father() {
        System.out.print("2 ");
    }

    {
        System.out.print("3 ");
    }

    int test() {
        System.out.print("4 ");
        return 1;
    }

    static int method() {
        System.out.print("5 ");
        return 1;
    }
}
