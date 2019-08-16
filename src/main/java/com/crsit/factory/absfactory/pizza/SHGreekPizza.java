package com.crsit.factory.absfactory.pizza;

/**
 * @ClassName: SHGreekPizza
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-12 11:51
 * @Version: 1.0.0
 **/
public class SHGreekPizza extends Pizza {
    public SHGreekPizza() {
        this.name = "上海希腊披萨";
    }
    @Override
    public void prepare() {
        System.out.println("给"+this.name+"准备材料！");
    }
}
