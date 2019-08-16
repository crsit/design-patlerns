package com.crsit.visitor;

/**
 * @ClassName: Success
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 14:46
 * @Version: 1.0.0
 **/
public class Fail extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println(" 男人评价：不满意");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println(" 女人评价：不满意");
    }
}
