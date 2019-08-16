package com.crsit.singleton;

/**
 * @ClassName: Singleton1
 * @Description: 懒汉模式
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-12 10:17
 * @Version: 1.0.0
 **/
public class Singleton4 {

    private static Singleton4 instance;

    private Singleton4() {
    }

    /**
     * 加synchronized 解决线程不安全问题，但同步方法效率变低。改方法不推荐
     * @return
     */
    public static synchronized Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }

}
