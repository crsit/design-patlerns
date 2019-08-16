package com.crsit.memento.game;

/**
 * @ClassName: GameRole
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-08-08 21:49
 * @Version: 1.0.0
 **/
public class GameRole {

    private int vit;
    private int def;

    public Memento createMemento() {
        return new Memento(vit, def);
    }

    public void recoverGameRole(Memento memento) {
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }

    public void dispaly() {
        System.out.println("有限角色当前的攻击力："+ this.vit+" 防御力："+this.def);
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
