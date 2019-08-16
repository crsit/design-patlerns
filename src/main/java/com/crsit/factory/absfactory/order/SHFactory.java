package com.crsit.factory.absfactory.order;

import com.crsit.factory.absfactory.box.Box;
import com.crsit.factory.absfactory.box.SHBox;
import com.crsit.factory.absfactory.pizza.Pizza;
import com.crsit.factory.absfactory.pizza.SHCheesePizza;
import com.crsit.factory.absfactory.pizza.SHGreekPizza;

/**
 * @ClassName: SHFactory
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-12 15:26
 * @Version: 1.0.0
 **/
public class SHFactory implements AbsFactory {
    @Override
    public Pizza createPizza() {
        return new SHCheesePizza();
    }

    @Override
    public Box createBox() {
        return new SHBox();
    }
}
