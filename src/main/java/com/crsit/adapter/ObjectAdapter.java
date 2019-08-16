package com.crsit.adapter;

import java.io.ObjectInputStream;

/**
 * @ClassName: ObjectAdapter
 * @Description: 以对象方式处理适配
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-13 11:59
 * @Version: 1.0.0
 **/
public class ObjectAdapter implements IVoltage5V {
    private Voltage220V voltage220V = null;

    public ObjectAdapter(Voltage220V voltage220V){
        this.voltage220V = voltage220V;
    }
    @Override
    public int output5V() {

        int srcV = voltage220V.output220v();
        int dstV = srcV / 44;
        System.out.println("将220V转换为5V");
        return dstV;
    }
}
