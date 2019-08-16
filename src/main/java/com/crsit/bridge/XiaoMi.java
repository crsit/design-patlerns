package com.crsit.bridge;

/**
 * @ClassName: XiaoMi
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-13 16:29
 * @Version: 1.0.0
 **/
public class XiaoMi implements Brand {
    private String name = "小米";
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
