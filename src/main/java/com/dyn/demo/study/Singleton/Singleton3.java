package com.dyn.demo.study.Singleton;

import java.util.Properties;

public class Singleton3 {
    public static final Singleton3 INSTANCE;
    private String info;

    private Singleton3(String info) {
        this.info = info;
    }

    static {
        try {
            Properties p = new Properties();
            p.load(Singleton3.class.getClassLoader().getResourceAsStream("prop.properties"));
            INSTANCE = new Singleton3(p.getProperty("info"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
