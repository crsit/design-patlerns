package com.crsit.mediator;

/**
 * @ClassName: App
 * @Description: 中介者模式（媒介模式）
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 17:39
 * @Version: 1.0.0
 **/
public class App {
    public static void main(String[] args) {

        Mediator mediator = new ConcreteMediator();
        Alarm alarm = new Alarm(mediator, "alarm");
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");
        Curtains curtains = new Curtains(mediator, "curtains");
        TV tv = new TV(mediator, "TV");
        alarm.sendAlarm(0);
        coffeeMachine.finishCoffee();
        alarm.sendAlarm(1);
    }
}
