package com.crsit.adapter;

/**
 * @ClassName: Phone
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-13 11:46
 * @Version: 1.0.0
 **/
public class Phone {

    public void charging(IVoltage5V iVoltage5V) {
        int dv = iVoltage5V.output5V();
        if( 5 == dv) {
            System.out.println("正确适配，可以充电");
        }else {
            System.out.println("错误适配，不能充电");
        }
    }
}
