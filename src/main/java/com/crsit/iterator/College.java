package com.crsit.iterator;

/**
 * @ClassName: College
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 16:10
 * @Version: 1.0.0
 **/
public interface College {
    public String getName();

    public void addDepartment(String name, String desc);

    public Iterator<Department> createIterator();
}
