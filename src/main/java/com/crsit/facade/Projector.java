package com.crsit.facade;

/**
 * @ClassName: Projector
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-13 22:06
 * @Version: 1.0.0
 **/
public class Projector {
    private String name = "Projector";
    private static Projector instance = new Projector();

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(this.name + " on ");
    }

    public void off() {
        System.out.println(this.name + " off");
    }

    public void focus() {
        System.out.println(this.name + " focus");
    }
}
