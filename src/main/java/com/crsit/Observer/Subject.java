package com.crsit.Observer;

/**
 * @ClassName: Subject
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 17:06
 * @Version: 1.0.0
 **/
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
}
