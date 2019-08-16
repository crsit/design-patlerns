package com.crsit.command;

/**
 * @ClassName: LightOffCommand
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 12:21
 * @Version: 1.0.0
 **/
public class LightOffCommand implements Command {
    private  LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver){
        this.lightReceiver = lightReceiver;
    }
    @Override
    public void execute() {
        lightReceiver.off();
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }
}
