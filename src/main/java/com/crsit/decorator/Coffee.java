package com.crsit.decorator;

/**
 * @ClassName: Coffee
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-13 17:01
 * @Version: 1.0.0
 **/
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
