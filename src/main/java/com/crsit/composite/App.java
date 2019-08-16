package com.crsit.composite;

/**
 * @ClassName: App
 * @Description: 组合设计模式
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-13 21:31
 * @Version: 1.0.0
 **/
public class App {

    public static void main(String[] args) {

        Component university = new University("金融大学");
        Component college = new College("计算机学院");
        Component college2 = new College("外语学院");
        Component department = new Department("软件工程");
        Component department1 = new Department("网络工程");
        Component department2 = new Department("计算机科学与技术");

        college.add(department);
        college.add(department1);
        college.add(department2);
        university.add(college);
        university.add(college2);
        university.print();
    }
}
