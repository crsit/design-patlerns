package com.crsit.singleton;

/**
 * @ClassName: Singleton1
 * @Description: 懒汉模式 静态内部类
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-12 10:17
 * @Version: 1.0.0
 **/
public class Singleton6 {

    private Singleton6() {
    }
    //静态内部内，jvm加载初始化时线程是安全的，延迟加载，效率高 （推荐使用）
    private static class SingletonInstance {
        private static final Singleton6 instance = new Singleton6();
    }

    public static Singleton6 getInstance() {
        return SingletonInstance.instance;
    }

}
