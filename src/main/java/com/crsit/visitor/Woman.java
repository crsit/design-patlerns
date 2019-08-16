package com.crsit.visitor;

/**
 * @ClassName: Woman
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 14:45
 * @Version: 1.0.0
 **/
public class Woman extends Person {
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
