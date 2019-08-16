package com.crsit.Observer;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName: WeatherData
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 17:15
 * @Version: 1.0.0
 **/
public class WeatherData implements Subject{

    private float temperature;
    private float pressure;
    private float humidity;
    private List<Observer> observerList;
    public WeatherData(){
        observerList = new LinkedList<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        Iterator<Observer> it = observerList.iterator();
        while(it.hasNext()){
            Observer observer = it.next();
            observer.update(this.temperature,this.pressure,this.humidity);
        }
    }
    public void setData(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObserver();
    }
    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
}
