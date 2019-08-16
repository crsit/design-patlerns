package com.crsit.bridge;

/**
 * @ClassName: App
 * @Description: 桥接模式
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-13 16:37
 * @Version: 1.0.0
 **/
public class App {
    public static void main(String[] args) {
        Phone phone1 = new FoldedPhone(new XiaoMi());
        phone1.open();
        phone1.call();
        phone1.close();
        System.out.println("====================================");
        Phone phone2 = new FoldedPhone(new Vivo());
        phone2.open();
        phone2.call();
        phone2.close();
    }
}
