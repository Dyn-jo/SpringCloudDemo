package com.dyn.demo.study.javabasic;

/**
 * 斐波那契数列：F(1)=1，F(2)=1, F(n)=F(n-1)+F(n-2)（n>=3，n∈N*）
 *
 * 5.递归迭代
 * n步台阶，每次只能走一步或两步，有多少种走法
 */
public class Test5 {
    public static void main(String[] args) {

        long start1 = System.currentTimeMillis();
        System.out.println(f(40));
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);

        long start2 = System.currentTimeMillis();
        System.out.println(loop(40));
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);
    }

    // 递归：可读性好，运算慢，容易造成堆栈溢出
    static int f(int n) {
        if (n < 1) {
            throw new RuntimeException("");
        }
        if (n == 1 || n == 2) {
            return n;
        }
        return f(n - 1) + f(n - 2);
    }

    // 迭代：运算快，可读性差
    static int loop(int n) {
        if (n < 1) {
            throw new RuntimeException("");
        }
        if (n == 1 || n == 2) {
            return n;
        }
        /**
         * f(n)=f(n-1)+f(n-2);
         * f(3)=f(2)+f(1);
         * f(4)=f(3)+f(2);
         * x=2;y=1;
         * sum=x+y;
         * y=x;
         * x=sum;
         */

        int x = 2;
        int y = 1;
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = x + y;
            y = x;
            x = sum;
        }
        return sum;
    }
}