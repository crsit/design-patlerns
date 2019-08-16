package com.crsit.factory.absfactory.box;

/**
 * @ClassName: BJBox
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-12 16:57
 * @Version: 1.0.0
 **/
public class BJBox extends Box {
    public BJBox() {
        this.name = "北京蓝色";
    }
    @Override
    public void boxing() {
        System.out.println("打包"+ this.name);
    }
}
