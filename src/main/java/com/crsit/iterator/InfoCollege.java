package com.crsit.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: ComputerCollege
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 16:17
 * @Version: 1.0.0
 **/
public class InfoCollege implements College {
    private List<Department> departments;

    public InfoCollege() {
        departments = new ArrayList<>();
        addDepartment("信息安全专业", "信息安全");
        addDepartment("网络安全", "网络安全");
        addDepartment("数据安全", "数据安全");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments.add(department);
    }

    @Override
    public Iterator<Department> createIterator() {
        return new InfoCollegeIterator(departments);
    }
}
