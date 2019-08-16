package com.crsit.strategy;

/**
 * @ClassName: App
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-08-09 15:42
 * @Version: 1.0.0
 **/
public class App {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.display();
        wildDuck.fly();
        ToyDuck toyDuck = new ToyDuck();
        toyDuck.display();
        toyDuck.fly();
        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.display();
        pekingDuck.fly();
    }
}
