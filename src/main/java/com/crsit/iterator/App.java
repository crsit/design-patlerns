package com.crsit.iterator;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName: App
 * @Description: 迭代模式
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 15:36
 * @Version: 1.0.0
 **/
public class App {
    public static void main(String[] args) {
        List<College>  collegeList = new LinkedList<>();
        collegeList.add(new ComputerCollege());
        collegeList.add(new InfoCollege());
        OutPutImpl outPut = new OutPutImpl(collegeList);
        outPut.printCollege();
    }
}
