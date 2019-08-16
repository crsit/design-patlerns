package com.crsit.memento.game;

/**
 * @ClassName: Caretaker
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-08-08 21:47
 * @Version: 1.0.0
 **/
public class Caretaker {
    private Memento memento;

    public Memento getMemento(){
        return this.memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
