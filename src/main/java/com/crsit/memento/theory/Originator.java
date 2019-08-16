package com.crsit.memento.theory;

/**
 * @ClassName: Originator
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-08-08 11:48
 * @Version: 1.0.0
 **/
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateMemento() {
        return new Memento(state);
    }

    public void resetFromMemento(Memento memento){
        this.state = memento.getState();
    }

}
