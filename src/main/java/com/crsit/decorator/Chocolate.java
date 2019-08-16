package com.crsit.decorator;

/**
 * @ClassName: Chocolate
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-13 17:11
 * @Version: 1.0.0
 **/
public class Chocolate extends Decorator {
    private String name = "巧克力调味品";
    public Chocolate(Drink drink) {
        super(drink);
        setDes(this.name);
        setPrice(3.0f); //调味品价格
    }
}
