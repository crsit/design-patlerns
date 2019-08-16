package com.crsit.strategy;

/**
 * @ClassName: BadFlyBehavior
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-08-09 15:31
 * @Version: 1.0.0
 **/
public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞翔技术一般");
    }
}
