package com.crsit.prototype;

/**
 * @ClassName: Farm
 * @Description: 浅拷贝，Sheep只拷贝对象引用，对象内容未拷贝
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-12 18:49
 * @Version: 1.0.0
 **/
public class Farm implements  Cloneable{
    private String name;
    private Sheep sheep;
    private String other;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sheep getSheep() {
        return sheep;
    }

    public void setSheep(Sheep sheep) {
        this.sheep = sheep;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
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
