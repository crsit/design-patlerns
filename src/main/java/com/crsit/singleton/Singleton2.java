package com.crsit.singleton;

/**
 * @ClassName: Singleton1
 * @Description: 饿汉模式
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-12 10:17
 * @Version: 1.0.0
 **/
public class Singleton2 {

    private final static Singleton2 instance;

    static {
        instance = new Singleton2();
    }

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return instance;
    }

}
