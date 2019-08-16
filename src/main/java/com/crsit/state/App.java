package com.crsit.state;

/**
 * @ClassName: App
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-08-09 11:00
 * @Version: 1.0.0
 **/
public class App {
    public static void main(String[] args) {
        RaffleActivity activity = new RaffleActivity(1);
        for (int i = 0; i < 100; i++) {
            System.out.println("----------第"+(i+1) +"次抽奖----------------");
            activity.debuctMoney();
            activity.raffle();
        }
    }
}
