package com.crsit.facade;

/**
 * @ClassName: DVDPlayer
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-13 22:02
 * @Version: 1.0.0
 **/
public class DVDPlayer {
    private String name = "DVD";
    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(this.name + " on ");
    }

    public void off() {
        System.out.println(this.name + " off");
    }

    public void play() {
        System.out.println(this.name + " play");
    }

    public void pause() {
        System.out.println(this.name + " pause");
    }
}
