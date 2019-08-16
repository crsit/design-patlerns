package com.crsit.factory.factorymethod.order;


import com.crsit.factory.factorymethod.pizza.BJCheesePizza;
import com.crsit.factory.factorymethod.pizza.BJGreekPizza;
import com.crsit.factory.factorymethod.pizza.Pizza;

/**
 * @ClassName: BJFactory
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-12 14:07
 * @Version: 1.0.0
 **/
public class BJFactory implements FactoryMethod {
    @Override
    public Pizza createPizza(String pizzaType) {
       Pizza pizza = null;
       if(pizzaType.equals("cheese"))
           pizza = new BJCheesePizza();
       else if(pizzaType.equals("greek"))
           pizza = new BJGreekPizza();

       return pizza;
    }
}
