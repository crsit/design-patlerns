package com.crsit.Observer;

/**
 * @ClassName: Observer
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 17:06
 * @Version: 1.0.0
 **/
public interface Observer {

    public void update(float temperature, float pressure, float humidity);
}
