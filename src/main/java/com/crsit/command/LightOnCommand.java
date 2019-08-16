package com.crsit.command;

/**
 * @ClassName: LightOnCommand
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 12:17
 * @Version: 1.0.0
 **/
public class LightOnCommand implements Command {
    LightReceiver light;

    public LightOnCommand(LightReceiver lightReceiver){
        this.light = lightReceiver;
    }

    @Override
    public void execute() {
        System.out.println("调用接受者的方法");
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
