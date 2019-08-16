package com.crsit.singleton;

/**
 * @ClassName: Singleton1
 * @Description: 懒汉模式
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-12 10:17
 * @Version: 1.0.0
 **/
public class Singleton5 {

    private static volatile Singleton5 instance;

    private Singleton5() {
    }

    /**
     * 加入双重检查，解决线程不安全问题、同时解决懒加载问题，并保证了效率 （推荐使用该方法）
     * @return
     */
    public static Singleton5 getInstance() {
        if (instance == null) {
            synchronized (Singleton5.class) {
                if (instance == null) {
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }

}
