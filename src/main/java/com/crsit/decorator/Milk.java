package com.crsit.decorator;

/**
 * @ClassName: Milk
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-13 20:48
 * @Version: 1.0.0
 **/
public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setDes("牛奶调味品");
        setPrice(3.0f);
    }
}
