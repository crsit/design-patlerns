package com.crsit.factory.simplefactory;

/**
 * @ClassName: CheesePizza
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-12 11:50
 * @Version: 1.0.0
 **/
public class CheesePizza extends Pizza {

    public CheesePizza() {
        this.name = "奶酪披萨";
    }

    @Override
    public void prepare() {
        System.out.println("给"+this.name+"准备材料！");
    }
}
