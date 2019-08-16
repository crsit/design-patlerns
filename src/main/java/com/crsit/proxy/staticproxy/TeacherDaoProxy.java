package com.crsit.proxy.staticproxy;

/**
 * @ClassName: TeacherDaoProxy
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 9:50
 * @Version: 1.0.0
 **/
public class TeacherDaoProxy implements ITeacherDao {
    private ITeacherDao target;
    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }
    @Override
    public void teach() {
        System.out.println("代理开始");
        this.target.teach();
        System.out.println("代理结束");
    }
}
