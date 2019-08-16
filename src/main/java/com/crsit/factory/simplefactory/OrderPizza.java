package com.crsit.factory.simplefactory;

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


    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        String pizzType = getType();
        Pizza pizza = simpleFactory.createPizza(pizzType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
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
}
