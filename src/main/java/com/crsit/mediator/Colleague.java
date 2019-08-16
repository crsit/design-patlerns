package com.crsit.mediator;

/**
 * @ClassName: Colleague
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 18:20
 * @Version: 1.0.0
 **/
public abstract class Colleague {
    private Mediator mediator;
    public String name;
    public Colleague(Mediator mediator, String name){
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void sendMessage(int stateChage);
}
