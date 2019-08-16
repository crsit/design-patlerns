package com.crsit.visitor;

/**
 * @ClassName: App
 * @Description: 访问者模式
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 13:06
 * @Version: 1.0.0
 **/
public class App {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());
        objectStructure.attach(new Man());
        Success success = new Success();
        objectStructure.display(success);

        Fail fail = new Fail();
        objectStructure.display(fail);

    }
}
