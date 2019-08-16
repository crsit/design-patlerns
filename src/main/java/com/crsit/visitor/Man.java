package com.crsit.visitor;

/**
 * @ClassName: Man
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 14:45
 * @Version: 1.0.0
 **/
public class Man extends Person {
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
