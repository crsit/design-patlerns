package com.crsit.command;

/**
 * @ClassName: Command
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 11:52
 * @Version: 1.0.0
 **/
public interface Command {
    public void execute();
    public void undo();
}
