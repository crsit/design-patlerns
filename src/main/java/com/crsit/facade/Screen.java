package com.crsit.facade;

/**
 * @ClassName: Screen
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-13 22:09
 * @Version: 1.0.0
 **/
public class Screen {

    private String name = "Screen";
    private static Screen instance = new Screen();

    public static Screen getInstance() {
        return instance;
    }

    public void up() {
        System.out.println(this.name + " up ");
    }

    public void down() {
        System.out.println(this.name + " down");
    }

}
