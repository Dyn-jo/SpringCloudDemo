package com.dyn.demo.study.Singleton;

import java.util.concurrent.*;

/**
 * 2.单例模式
 */
public class Test2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        for (int i = 0; i < 2; i++) {
            Singleton1 singleton1 = Singleton1.INSTANCE;
            System.out.println("singleton1第" + i + "次：" + singleton1);
            Singleton2 singleton2 = Singleton2.INSTANCE;
            System.out.println("singleton2第" + i + "次：" + singleton2);
            Singleton3 singleton3 = Singleton3.INSTANCE;
            System.out.println("singleton3第" + i + "次：" + singleton3);

            Singleton6 singleton6 = Singleton6.getInstance();
            System.out.println("singleton6第" + i + "次：" + singleton6);
        }

        Callable<Singleton4> c = new Callable<Singleton4>() {
            @Override
            public Singleton4 call() throws Exception {
                return Singleton4.getInstance();
            }
        };
        ExecutorService e = Executors.newFixedThreadPool(2);
        Future<Singleton4> f1 = e.submit(c);
        Future<Singleton4> f2 = e.submit(c);
        Singleton4 s41 = f1.get();
        Singleton4 s42 = f2.get();
        System.out.println("Singleton4结果：");
        System.out.println(s41 == s42);
        e.shutdown();

        Callable<Singleton5> c2 = new Callable<Singleton5>() {
            @Override
            public Singleton5 call() throws Exception {
                return Singleton5.getInstance();
            }
        };
        ExecutorService e2 = Executors.newFixedThreadPool(2);
        Future<Singleton5> f3 = e2.submit(c2);
        Future<Singleton5> f4 = e2.submit(c2);
        Singleton5 s51 = f3.get();
        Singleton5 s52 = f4.get();
        System.out.println("Singleton5结果：");
        System.out.println(s51 == s52);
        e2.shutdown();

    }
}

