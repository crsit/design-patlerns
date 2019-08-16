package com.crsit.factory.factorymethod.order;


import com.crsit.factory.factorymethod.pizza.Pizza;

/**
 * @ClassName: FactoryMethod
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-12 11:53
 * @Version: 1.0.0
 **/
public interface FactoryMethod {
    public Pizza createPizza(String pizzaType);
}
