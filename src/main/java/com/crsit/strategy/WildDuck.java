package com.crsit.strategy;

/**
 * @ClassName: WildDuck
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-08-09 15:35
 * @Version: 1.0.0
 **/
public class WildDuck extends Duck {

    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println(" 这是野鸭子");
    }


}
