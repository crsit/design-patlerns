package com.crsit.facade;

/**
 * @ClassName: App
 * @Description: 外观模式
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-13 22:14
 * @Version: 1.0.0
 **/
public class App {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
        homeTheaterFacade.pause();
        homeTheaterFacade.end();
    }
}
