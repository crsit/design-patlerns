package com.crsit.factory.absfactory.pizza;


/**
 * @ClassName: BJGreekPizza
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-12 11:51
 * @Version: 1.0.0
 **/
public class BJGreekPizza extends Pizza {
    public BJGreekPizza() {
        this.name = "北京希腊披萨";
    }
    @Override
    public void prepare() {
        System.out.println("给"+this.name+"准备材料！");
    }
}
