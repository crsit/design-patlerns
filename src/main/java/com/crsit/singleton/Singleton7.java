package com.crsit.singleton;

/**
 * @ClassName: Singleton1
 * @Description: 懒汉模式 静态内部类
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-12 10:17
 * @Version: 1.0.0
 **/
public class Singleton7 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1==instance2);
        System.out.println(instance1.hashCode()==instance2.hashCode());
    }
}

/**
 * 这种单利模式，保证线程安全，而且防止反序列化重新创建新的对象，效率高，推荐使用
 */
enum Singleton {
    INSTANCE;
    public void sayHello() {
        System.out.println("hello!");
    }
}
