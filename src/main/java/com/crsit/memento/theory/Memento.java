package com.crsit.memento.theory;

/**
 * @ClassName: Memento
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-08-08 11:56
 * @Version: 1.0.0
 **/
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
