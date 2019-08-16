package com.crsit.facade;

/**
 * @ClassName: Popcorn
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-13 22:04
 * @Version: 1.0.0
 **/
public class Popcorn {
    private String name = "Popcorn";
    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(this.name + " on ");
    }

    public void off() {
        System.out.println(this.name + " off");
    }

    public void pop() {
        System.out.println(this.name + " poping");
    }
}
