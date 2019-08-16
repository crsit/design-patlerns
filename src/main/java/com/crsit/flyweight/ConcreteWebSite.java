package com.crsit.flyweight;

/**
 * @ClassName: ConcreteWebSite
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-13 22:43
 * @Version: 1.0.0
 **/
public class ConcreteWebSite extends WebSite {
    private String type= ""; //网站发布类型
    public ConcreteWebSite(String type) {
        this.type = type;
    }
    @Override
    public void use() {
        System.out.println("网站发布形式为：" + this.type);
    }
}
