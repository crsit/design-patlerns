package com.crsit.singleton;

/**
 * @ClassName: Singleton1
 * @Description: 饿汉模式
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-12 10:17
 * @Version: 1.0.0
 **/
public class Singleton1 {

    private final static Singleton1 instance = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return instance;
    }

}
