package com.crsit.iterator;

import java.util.List;

/**
 * @ClassName: ComputerCollegeIterator
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 15:55
 * @Version: 1.0.0
 **/
public class InfoCollegeIterator implements Iterator<Department> {

    List<Department> departments = null;
    int index = 0;

    public InfoCollegeIterator(List<Department> departments){
        this.departments = departments;
    }
    @Override
    public boolean hasNext() {
        return !(departments==null||index>departments.size()-1);
    }

    @Override
    public Department next() {
        Department department = departments.get(index++);
        return department;
    }

}
