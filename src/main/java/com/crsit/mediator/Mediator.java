package com.crsit.mediator;

/**
 * @ClassName: Mediator
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 18:22
 * @Version: 1.0.0
 **/
public abstract class Mediator {
    public abstract void register(String name, Colleague colleague);
    public abstract void getMessage(int stateChange, String name);
    public abstract void sendMessage();
}
