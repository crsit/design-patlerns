package com.crsit.iterator;

/**
 * @ClassName: Iterator
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 15:44
 * @Version: 1.0.0
 **/
public interface Iterator<T> {

    public boolean hasNext();

    public T next();

}
