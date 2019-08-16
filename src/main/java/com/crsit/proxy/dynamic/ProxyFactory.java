package com.crsit.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName: ProxyFactory
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 10:05
 * @Version: 1.0.0
 **/
public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        /*
        public static Object newProxyInstance(ClassLoader loader,
                Class<?>[] interfaces,
                InvocationHandler h)
         1.loader 指定当前目标对象使用的类加载器，获取加载器的方法固定
         2.interfaces 目标对象实现的接口类型，使用泛型方法确认类型


         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("JDK代理开始");
                Object returnVal = method.invoke(target, args);
                return returnVal;
            }
        });
    }
}
