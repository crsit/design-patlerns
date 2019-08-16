package com.crsit.builder;

/**
 * @ClassName: HighBuilder
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-13 10:56
 * @Version: 1.0.0
 **/
public class HighBuilder extends HouseBuilder {
    private String name="金融大厦";
    @Override
    public void buildBasic() {
        System.out.println(this.name + "打造地基");
    }

    @Override
    public void buildWalls() {
        System.out.println(this.name + "砌墙");
    }

    @Override
    public void buildRoofed() {
        System.out.println(this.name + "封顶");
    }
}
