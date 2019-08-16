package com.crsit.factory.absfactory.pizza;

/**
 * @ClassName: BJCheesePizza
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-12 11:50
 * @Version: 1.0.0
 **/
public class BJCheesePizza extends Pizza {
    public BJCheesePizza() {
        this.name = "北京奶酪披萨";
    }
    @Override
    public void prepare() {
        System.out.println("给"+this.name+"准备材料！");
    }
}
