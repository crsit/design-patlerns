package com.crsit.strategy;

/**
 * @ClassName: PekingDuck
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-08-09 15:39
 * @Version: 1.0.0
 **/
public class PekingDuck extends Duck {

    public PekingDuck() {
        flyBehavior = new BadFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("北京鸭子");
    }
}
