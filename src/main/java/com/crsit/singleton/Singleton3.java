package com.crsit.singleton;

/**
 * @ClassName: Singleton1
 * @Description: 懒汉模式
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-12 10:17
 * @Version: 1.0.0
 **/
public class Singleton3 {

    private static Singleton3 instance;

    private Singleton3() {
    }

    /**
     * 线程不安全
     * @return
     */
    public static Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }

}
