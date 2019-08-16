package com.crsit.strategy;

/**
 * @ClassName: NoFlyBehavior
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-08-09 15:32
 * @Version: 1.0.0
 **/
public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞翔");
    }
}
