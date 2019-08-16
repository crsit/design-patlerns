package com.crsit.flyweight;

/**
 * @ClassName: App
 * @Description: 享元模式
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-13 22:36
 * @Version: 1.0.0
 **/
public class App {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        WebSite webSite = factory.getWebSiteCategory("新闻");
        webSite.use();

        WebSite webSite2 = factory.getWebSiteCategory("博客");
        webSite2.use();

        WebSite webSite3 = factory.getWebSiteCategory("博客");
        webSite3.use();

        System.out.println("网站数量："+factory.getWebSiteCount());
    }
}
