package com.crsit.flyweight;

import java.util.HashMap;

/**
 * @ClassName: WebSiteFactory
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-13 22:43
 * @Version: 1.0.0
 **/
public class WebSiteFactory {
    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    //根据网站类型，返回一个网站，如果没有则创建一个
    public WebSite getWebSiteCategory(String type){
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebSite(type));
        }
        return (WebSite) pool.get(type);
    }

    public int getWebSiteCount() {
        return pool.size();
    }
}
