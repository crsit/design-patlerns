package com.crsit.Observer;

/**
 * @ClassName: CurrentCondition
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 17:10
 * @Version: 1.0.0
 **/
public class BaiduCondition implements Observer{
    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("百度今天温度："+this.temperature);
        System.out.println("百度今天气压："+this.pressure);
        System.out.println("百度今天湿度："+this.humidity);
    }
}
