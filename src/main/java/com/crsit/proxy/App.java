package com.crsit.proxy;

import com.crsit.proxy.cglib.CGProxyFactory;
import com.crsit.proxy.dynamic.ProxyFactory;
import com.crsit.proxy.staticproxy.ITeacherDao;
import com.crsit.proxy.staticproxy.TeacherDao;
import com.crsit.proxy.staticproxy.TeacherDaoProxy;

/**
 * @ClassName: App
 * @Description: 代理模式
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 9:45
 * @Version: 1.0.0
 **/
public class App {
    public static void main(String[] args) {
        //静态代理
        TeacherDao teacherDao = new TeacherDao();
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        teacherDaoProxy.teach();

        //动态代理
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(teacherDao).getProxyInstance();
        proxyInstance.teach();

        //cglib代理
        CGProxyFactory proxyFactory = new CGProxyFactory(teacherDao);
        ITeacherDao cgproxyInstance = (ITeacherDao)proxyFactory.getProxyInstance();
        cgproxyInstance.teach();

    }
}
