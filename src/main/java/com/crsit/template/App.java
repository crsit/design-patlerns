package com.crsit.template;

/**
 * @ClassName: App
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 11:25
 * @Version: 1.0.0
 **/
public class App {
    public static void main(String[] args) {

        SoyaMilk redBeanSoyaMilk = new RedBearSoyaMilk();
        redBeanSoyaMilk.make();

        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();
    }
}
