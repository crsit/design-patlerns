package com.crsit.template;

/**
 * @ClassName: SoyaMilk
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 11:30
 * @Version: 1.0.0
 **/
public abstract class SoyaMilk {
    public final void make() {
        select();
        addCondiments();
        soak();
        beat();
    }

    public void select() {
        System.out.println("选择材料");
    }

    public abstract void addCondiments();//添加配料

    public void soak() {
        System.out.println("浸泡材料");
    }

    public void beat() {
        System.out.println("打浆");
    }

}
