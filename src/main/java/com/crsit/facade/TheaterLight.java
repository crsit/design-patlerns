package com.crsit.facade;

/**
 * @ClassName: TheaterLight
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-13 22:12
 * @Version: 1.0.0
 **/
public class TheaterLight {
    private String name = "TheaterLight";
    private static TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(this.name + " on ");
    }

    public void off() {
        System.out.println(this.name + " off");
    }
    public void dim() {
        System.out.println(this.name + " dim ");
    }

    public void bright() {
        System.out.println(this.name + " bright");
    }
}
