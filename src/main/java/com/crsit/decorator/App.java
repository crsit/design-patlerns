package com.crsit.decorator;


/**
 * @ClassName: App
 * @Description: 装饰者模式
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-13 20:44
 * @Version: 1.0.0
 **/
public class App {

    public static void main(String[] args) {
        Drink drink = new LongBlack(); // 点一份LongBlack;
        System.out.println("费用1=" + drink.cost());
        System.out.println("描述：" + drink.getDes());
        drink = new Chocolate(drink); //加巧克力
        System.out.println("费用2=" + drink.cost());
        System.out.println("描述：" + drink.getDes());
        drink = new Milk(drink);
        System.out.println("费用3=" + drink.cost());
        System.out.println("描述：" + drink.getDes());


    }
}
