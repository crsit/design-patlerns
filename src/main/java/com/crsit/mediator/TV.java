package com.crsit.mediator;

/**
 * @ClassName: Curtains
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 18:34
 * @Version: 1.0.0
 **/
public class TV extends Colleague {


    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChage) {
        this.getMediator().getMessage(stateChage, this.name);
    }

    public void startTV() {
        System.out.println("It's time to startTV!");
    }
    public void stopTV() {
        System.out.println("It's time to stopTV!");
    }
}
