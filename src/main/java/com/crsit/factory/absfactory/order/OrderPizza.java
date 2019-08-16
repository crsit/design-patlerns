package com.crsit.factory.absfactory.order;


import com.crsit.factory.absfactory.box.Box;
import com.crsit.factory.absfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

/**
 * @ClassName: OrderPizza
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-12 11:57
 * @Version: 1.0.0
 **/
public class OrderPizza {


    private Pizza pizza;
    private Box box;

    private void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    private void setBox(Box box) {
        this.box = box;
    }

    public void run() {
        this.pizza.prepare();
        this.pizza.bake();
        this.pizza.cut();
        this.box.boxing();
    }
    public void createPizz(final AbsFactory absFactory) {
        setPizza(absFactory.createPizza());
        setBox(absFactory.createBox());
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

        OrderPizza op = new OrderPizza();
        op.createPizz(new SHFactory());
        op.run();

        OrderPizza op2 = new OrderPizza();
        op2.createPizz(new BJFactory());
        op2.run();

        Calendar calendar = Calendar.getInstance();
    }
}
