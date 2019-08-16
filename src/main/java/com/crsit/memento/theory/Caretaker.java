package com.crsit.memento.theory;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Caretaker
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-08-08 12:00
 * @Version: 1.0.0
 **/
public class Caretaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
