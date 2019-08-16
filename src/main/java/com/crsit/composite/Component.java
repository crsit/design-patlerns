package com.crsit.composite;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName: Component
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-13 21:20
 * @Version: 1.0.0
 **/
public abstract class Component {
    private String name;
    private List<Component> children = new LinkedList<>();
    public int count() {
        return children.size();
    }
    protected void add(Component component) {
        children.add(component);
    }

    protected void remove(Component component) {
        children.remove(component);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void printThisBefore() {
        System.out.println(this.name + "开始打印");
    }

    protected void printThisAfter() {
        System.out.println(this.name + "结束打印");
    }

    /**
     * Print
     */
    public void print() {
        printThisBefore();
        System.out.println("childre len:"+ count());
        for (Component letter : children) {
            letter.print();
        }
        printThisAfter();
    }
}
