package com.crsit.decorator;

/**
 * @ClassName: Decorator
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-13 17:06
 * @Version: 1.0.0
 **/
public class Decorator extends Drink {
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }
    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDes() {
        return super.getDes() + "" + super.getPrice() +" && " + drink.getDes();
    }
}
