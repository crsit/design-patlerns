package com.crsit.adapter;

/**
 * @ClassName: VoltageAdapter
 * @Description: 类适配，通过继承待适配的类来完成特定接口方法
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-13 11:43
 * @Version: 1.0.0
 **/
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        int srcV = output220v();
        int dstV = srcV / 44;
        System.out.println("将220V转换为5V");
        return dstV;
    }
}
