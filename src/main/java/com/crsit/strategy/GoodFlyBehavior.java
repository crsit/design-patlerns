package com.crsit.strategy;

/**
 * @ClassName: GoodFlyBehavior
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-08-09 15:30
 * @Version: 1.0.0
 **/
public class GoodFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞翔技术高超");
    }
}
