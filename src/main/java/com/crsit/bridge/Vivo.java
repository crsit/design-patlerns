package com.crsit.bridge;

/**
 * @ClassName: Vivo
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-13 16:30
 * @Version: 1.0.0
 **/
public class Vivo implements Brand {
    private String name = "VIVO";

    @Override
    public void open() {
        System.out.println(this.name + "手机打开");
    }

    @Override
    public void close() {
        System.out.println(this.name + "手机关闭");
    }

    @Override
    public void call() {
        System.out.println(this.name + "手机打电话");
    }
}
