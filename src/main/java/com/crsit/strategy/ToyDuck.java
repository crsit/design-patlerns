package com.crsit.strategy;

/**
 * @ClassName: ToyDuck
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-08-09 15:41
 * @Version: 1.0.0
 **/
public class ToyDuck extends Duck {

    public ToyDuck() {
        flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是玩具鸭子");
    }
}
