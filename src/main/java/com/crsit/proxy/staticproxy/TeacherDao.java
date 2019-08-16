package com.crsit.proxy.staticproxy;

/**
 * @ClassName: 1TeacherDao
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 9:48
 * @Version: 1.0.0
 **/
public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("老师授课");
    }
}
