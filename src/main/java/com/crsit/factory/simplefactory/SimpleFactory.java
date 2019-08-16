package com.crsit.factory.simplefactory;

/**
 * @ClassName: SimpleFactory
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-12 11:53
 * @Version: 1.0.0
 **/
public class SimpleFactory {
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if(pizzaType.equals("cheese")){
            pizza = new CheesePizza();
        }else if(pizzaType.equals("greek")){
            pizza = new GreekPizza();
        }
        return pizza;
    }
}
