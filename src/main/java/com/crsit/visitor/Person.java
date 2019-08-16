package com.crsit.visitor;

/**
 * @ClassName: Person
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 14:45
 * @Version: 1.0.0
 **/
public abstract class Person {
    public abstract void accept(Action action);
}
