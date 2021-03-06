package com.crsit.command;

/**
 * @ClassName: RemoteController
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 12:24
 * @Version: 1.0.0
 **/
public class RemoteController {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;
    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i=0;i<5;i++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;

    }

    public void onButtonWasPushed(int no){
        onCommands[no].execute();
        undoCommand = onCommands[no];
    }

    public void offButtonWasPushed(int no){
        offCommands[no].execute();
        undoCommand = offCommands[no];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}
