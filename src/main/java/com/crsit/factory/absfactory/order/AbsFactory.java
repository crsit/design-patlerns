package com.crsit.factory.absfactory.order;

import com.crsit.factory.absfactory.box.Box;
import com.crsit.factory.absfactory.pizza.Pizza;

/**
 * @ClassName: AbsFactory
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-12 15:25
 * @Version: 1.0.0
 **/
public interface AbsFactory { //披萨礼盒
    public Pizza createPizza();
    public Box createBox();
}
