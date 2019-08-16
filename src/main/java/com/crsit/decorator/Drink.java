package com.crsit.decorator;

/**
 * @ClassName: Drink
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-13 16:58
 * @Version: 1.0.0
 **/
public abstract class Drink {

    public String des; //描述
    private float price = 0.0f;

    public abstract float cost();

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
