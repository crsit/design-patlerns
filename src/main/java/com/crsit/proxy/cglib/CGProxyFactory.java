package com.crsit.proxy.cglib;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName: CGProxyFactory
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 10:57
 * @Version: 1.0.0
 **/
public class CGProxyFactory implements MethodInterceptor {
    private Object target;

    public CGProxyFactory(Object target){
        this.target = target;
    }

    public Object getProxyInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib 代理模式开始");
        Object retValue = method.invoke(target, objects);
        System.out.println("cglib 代理模式结束");
        return retValue;
    }
}
