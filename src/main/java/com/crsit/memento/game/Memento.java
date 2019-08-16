package com.crsit.memento.game;

/**
 * @ClassName: Memento
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-08-08 11:56
 * @Version: 1.0.0
 **/
public class Memento {
    private int vit;
    private int def;


    public Memento(int vit, int def){
        this.vit = vit;
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
