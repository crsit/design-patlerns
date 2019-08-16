package com.crsit.command;

/**
 * @ClassName: App
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 12:03
 * @Version: 1.0.0
 **/
public class App {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();
        LightReceiver lightReceiver = new LightReceiver();
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        //给遥控器设置命令，比如第一个是点电灯开关
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);
        remoteController.onButtonWasPushed(0);
        remoteController.undoButtonWasPushed();


    }
}
