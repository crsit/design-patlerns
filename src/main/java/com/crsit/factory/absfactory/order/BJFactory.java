package com.crsit.factory.absfactory.order;

import com.crsit.factory.absfactory.box.BJBox;
import com.crsit.factory.absfactory.box.Box;
import com.crsit.factory.absfactory.pizza.BJCheesePizza;
import com.crsit.factory.absfactory.pizza.BJGreekPizza;
import com.crsit.factory.absfactory.pizza.Pizza;

/**
 * @ClassName: BJFactory
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-12 15:26
 * @Version: 1.0.0
 **/
public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza() {
        return new BJCheesePizza();
    }

    @Override
    public Box createBox() {
        return new BJBox();
    }
}
