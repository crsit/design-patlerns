package com.crsit.factory.simplefactory;

/**
 * @ClassName: GreekPizza
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-12 11:51
 * @Version: 1.0.0
 **/
public class GreekPizza extends Pizza {
    public GreekPizza() {
        this.name = "希腊披萨";
    }
    @Override
    public void prepare() {
        System.out.println("给"+this.name+"准备材料！");
    }
}
