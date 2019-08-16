package com.crsit.prototype;

import java.io.*;

/**
 * @ClassName: Farm
 * @Description: 浅拷贝，Sheep只拷贝对象引用，对象内容未拷贝
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-12 18:49
 * @Version: 1.0.0
 **/
public class FarmDeep2 implements Serializable, Cloneable{
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
    public Object clone() { //反序列化拷贝, 推荐使用
        Object o = null;
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            o = ois.readObject();
            return o;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }
}
