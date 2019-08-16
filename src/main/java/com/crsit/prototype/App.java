package com.crsit.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: App
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-12 17:44
 * @Version: 1.0.0
 **/
public class App {
    public static void main(String[] args) {
        Sheep sheep = new Sheep();
        sheep.setName("a1");
        sheep.setAge(1);
        sheep.setColor("红色");

        System.out.println(sheep);
        Sheep sheep1 = (Sheep) sheep.clone();
        sheep1.setAge(22);

        System.out.println(sheep);
        System.out.println(sheep1);

        FarmDeep1 fd = new FarmDeep1();
        fd.setName("fd1");
        fd.setSheep(sheep);
        fd.setOther("山羊");

        FarmDeep1 farmDeep1 = (FarmDeep1) fd.clone();
        System.out.println(fd);
        System.out.println(farmDeep1);
        System.out.println(fd.hashCode() + "  " + farmDeep1.hashCode());
        System.out.println(fd.getSheep().hashCode() + "  " + farmDeep1.getSheep().hashCode());


        FarmDeep2 farmDeep2 = new FarmDeep2();
        farmDeep2.setName("fd1");
        farmDeep2.setSheep(sheep);
        farmDeep2.setOther("山羊");

        FarmDeep2 farmDeep21 = (FarmDeep2) farmDeep2.clone();
        System.out.println(farmDeep2);
        System.out.println(farmDeep21);
        System.out.println(farmDeep2.hashCode() + "  " + farmDeep21.hashCode());
        System.out.println(farmDeep2.getSheep().hashCode() + "  " + farmDeep21.getSheep().hashCode());



    }
}
