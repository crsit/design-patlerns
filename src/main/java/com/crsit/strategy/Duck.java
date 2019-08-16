package com.crsit.strategy;

/**
 * @ClassName: Duck
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-08-09 15:33
 * @Version: 1.0.0
 **/
public abstract class Duck {

    FlyBehavior flyBehavior = null;

    public Duck() {

    }

    public abstract void display();

    public void quack() {
        System.out.println("鸭子会叫");
    }

    public void swim() {
        System.out.println("鸭子会飞");
    }

    public void fly() {
        if (flyBehavior != null)
            flyBehavior.fly();
    }
}
