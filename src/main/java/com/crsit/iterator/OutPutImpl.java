package com.crsit.iterator;

import java.util.List;

/**
 * @ClassName: OutPutImpl
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 16:31
 * @Version: 1.0.0
 **/
public class OutPutImpl {
    List<College> collegeList ;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    public void printCollege(){
        java.util.Iterator<College> it = collegeList.iterator();
        while(it.hasNext()){
            College c = it.next();
            System.out.println("==============="+c.getName()+"================");
            printDepartment(c.createIterator());
        }
    }

    public void printDepartment(Iterator<Department> it){
        while (it.hasNext()){
            System.out.println(it.next().getName());
        }
    }
}
