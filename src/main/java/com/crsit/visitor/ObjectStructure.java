package com.crsit.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName: ObjectStructure
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 14:54
 * @Version: 1.0.0
 **/
public class ObjectStructure {
    private List<Person> persons = new LinkedList<>();

    public void attach(Person p){
        persons.add(p);
    }

    public void detach(Person p){
        persons.remove(p);
    }

    public void display(Action action) {
        for(Person p:persons) {
            p.accept(action);
        }
    }
}
