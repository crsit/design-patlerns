package com.crsit.factory.simplefactory;

/**
 * @ClassName: Pizza
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-12 11:45
 * @Version: 1.0.0
 **/
public abstract class Pizza {
    protected String name;

    /**
     * 准备原材料
     */
    public abstract void prepare();

    public void bake() {
        System.out.println(name + " baking;");
    }

    public void cut() {
        System.out.println(name + " cutting;");
    }

    public void box() {
        System.out.println(name + " boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }
}
