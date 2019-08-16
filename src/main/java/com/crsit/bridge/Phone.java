package com.crsit.bridge;

/**
 * @ClassName: Phone
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-13 16:32
 * @Version: 1.0.0
 **/
public abstract class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        super();
        this.brand = brand;
    }

    protected void open() {
        brand.open();
    }

    protected void close() {
        brand.close();
    }

    protected void call() {
        brand.close();
    }
}
