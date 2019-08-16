package com.crsit.builder;

/**
 * @ClassName: HouseBuilder
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-13 10:48
 * @Version: 1.0.0
 **/
public abstract class HouseBuilder {
    protected House house = new House();

    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void buildRoofed();

    public House buildHouse() {
        return house;
    }
}
