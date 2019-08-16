package com.crsit.iterator;

/**
 * @ClassName: ComputerCollegeIterator
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 15:55
 * @Version: 1.0.0
 **/
public class ComputerCollegeIterator implements Iterator<Department> {

    Department[] departments;
    int position = 0;

    public ComputerCollegeIterator(Department[] departments){
        this.departments = departments;
    }
    @Override
    public boolean hasNext() {
        return !(position>=departments.length||departments[position]==null);
    }

    @Override
    public Department next() {
        Department department = departments[position++];
        return department;
    }

}
