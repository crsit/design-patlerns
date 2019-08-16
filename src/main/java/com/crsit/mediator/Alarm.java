package com.crsit.mediator;

/**
 * @ClassName: Alarm
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 18:23
 * @Version: 1.0.0
 **/
public class Alarm extends Colleague {

    public Alarm(Mediator mediator, String name){
        super(mediator, name);
        mediator.register(name, this);
    }
    public void sendAlarm(int stateChange){
        sendMessage(stateChange);
    }
    @Override
    public void sendMessage(int stateChage) {
        this.getMediator().getMessage(stateChage, this.name);
    }
}
