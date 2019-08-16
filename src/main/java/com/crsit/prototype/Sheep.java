package com.crsit.prototype;

import java.io.Serializable;

/**
 * @ClassName: Sheep
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-12 17:40
 * @Version: 1.0.0
 **/
public class Sheep implements Serializable, Cloneable {
    private String name;
    private String color;
    private int age;
    private Sheep friend;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }
    @Override
    public String toString() {
        return "Sheep [name=" + this.name + ", age=" + this.age + ", color=" + this.color + "]";
    }

    @Override
    public Object clone() {
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return o;
    }

}
