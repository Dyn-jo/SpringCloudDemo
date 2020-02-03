package com.dyn.demo.study.javabasic;

/**
 * 3.类初始化和对象实例化
 *
 *
 * 先初始化父类           5 1
 * 再初始化子类<clinit>:  10 6
 * 1、j = method()
 * 2、static {}
 * <p>
 * 子类的实例化方法：
 * 1、super()        9 3 2
 * 2、i = test();    9
 * 3、构造块          8
 * 4、构造方法        7
 * <p>
 * 因为创建两个对象，实例初始化执行两次
 */
public class Son extends Father {
    private int i = test();
    private static int j = method();

    static {
        System.out.print("6 ");
    }

    Son() {
//        super(); 写与不写，均会调用父类构造器
        System.out.print("7 ");
    }

    {
        System.out.print("8 ");
    }

    int test() {
        System.out.print("9 ");
        return 1;
    }

    static int method() {
        System.out.print("10 ");
        return 1;
    }

    public static void main(String[] args) {
        Son s1 = new Son();
        System.out.println();
        Son s2 = new Son();
    }
}
