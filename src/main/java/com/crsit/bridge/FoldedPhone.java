package com.crsit.bridge;

/**
 * @ClassName: FoldedPhone
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-13 16:34
 * @Version: 1.0.0
 **/
public class FoldedPhone extends Phone {
    private String name = "折叠手机";
    public FoldedPhone(Brand brand) {
        super(brand);
    }
    public void open() {
        super.open();
        System.out.println(this.name + "打开");
    }
    public void close() {
        super.close();
        System.out.println(this.name+ "关闭");
    }
    public void call() {
        super.call();
        System.out.println(this.name+"打电话");
    }
}
