package com.crsit.factory.factorymethod.order;


import com.crsit.factory.factorymethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName: OrderPizza
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-12 11:57
 * @Version: 1.0.0
 **/
public class OrderPizza {

    private FactoryMethod factory;

    public  OrderPizza(FactoryMethod factory) {
        this.factory = factory;
    }

    public void run(){
        String pizzType = getType();
        Pizza pizza = factory.createPizza(pizzType);
        if(pizza!=null){
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }else {
            System.out.println("订购的披萨不存在!");
        }
    }
    private static String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static void main(String[] args) {

        OrderPizza orderPizza = new OrderPizza(new BJFactory());
        orderPizza.run();

        OrderPizza orderPizza1 = new OrderPizza(new SHFactory());
        orderPizza1.run();
    }



}
