package com.crsit.iterator;

/**
 * @ClassName: ComputerCollege
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 16:17
 * @Version: 1.0.0
 **/
public class ComputerCollege implements College {
    private Department[] departments;
    private int numOfDepartment = 0;

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("java专业", "java专业");
        addDepartment("Python专业", "Python专业");
        addDepartment("大数据专业", "大数据专业");
        addDepartment("go专业", "go专业");
        addDepartment("php专业", "php专业");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment++] = department;
    }

    @Override
    public Iterator<Department> createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
