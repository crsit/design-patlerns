package com.crsit.Observer;

/**
 * @ClassName: App
 * @Description: 观察者模式
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 16:47
 * @Version: 1.0.0
 **/
public class App {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentCondition currentCondition = new CurrentCondition();

        weatherData.registerObserver(currentCondition);
        weatherData.setData(10f, 10f, 80f);
        System.out.println("==========================");
        BaiduCondition baiduCondition = new BaiduCondition();
        weatherData.registerObserver(baiduCondition);
        weatherData.setData(20f, 30f, 90f);
    }
}
