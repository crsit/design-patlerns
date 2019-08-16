package com.crsit.factory.absfactory.box;

/**
 * @ClassName: SHBox
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-12 16:57
 * @Version: 1.0.0
 **/
public class SHBox extends Box {
    public SHBox() {
        this.name = "上海红色";
    }
    @Override
    public void boxing() {
        System.out.println("打包"+ this.name);
    }
}
