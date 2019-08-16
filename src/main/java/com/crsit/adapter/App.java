package com.crsit.adapter;

import com.crsit.adapter.interfaceadapter.AbsAdapter;
import com.crsit.factory.absfactory.order.AbsFactory;

/**
 * @ClassName: App
 * @Description: 接口模式适配
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-13 11:49
 * @Version: 1.0.0
 **/
public class App {
    public static void main(String[] args) {
        VoltageAdapter va = new VoltageAdapter();
        Phone phone = new Phone();
        phone.charging(va);


        ObjectAdapter oa = new ObjectAdapter(new Voltage220V());
        phone.charging(oa);

        AbsAdapter absAdapter = new AbsAdapter(){
            @Override
            public void m2() {
                System.out.println("m2实现");
            }
        };

        absAdapter.m2();

    }
}
