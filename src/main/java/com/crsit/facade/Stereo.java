package com.crsit.facade;

/**
 * @ClassName: Stereo
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-13 22:11
 * @Version: 1.0.0
 **/
public class Stereo {
    private String name="Stereo";
    private static Stereo instance = new Stereo();

    public static Stereo getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(this.name + " on ");
    }

    public void off() {
        System.out.println(this.name + " off");
    }
    public void up() {
        System.out.println(this.name + " up ");
    }

    public void down() {
        System.out.println(this.name + " down");
    }
}
