package com.crsit.builder;

/**
 * @ClassName: App
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-13 11:02
 * @Version: 1.0.0
 **/
public class App {
    public static void main(String[] args) {
        HouseDirector houseDirector = new HouseDirector(new CommonHouse());
        House house = houseDirector.constructHouse();
        System.out.println("-----------------------");

        houseDirector.setHouseBuilder(new HighBuilder());
        house = houseDirector.constructHouse();
        System.out.println("-----------------------");

        StringBuilder sb = new StringBuilder();
    }
}
