package com.crsit.memento.game;

/**
 * @ClassName: App
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-08-08 21:53
 * @Version: 1.0.0
 **/
public class App {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole();
        gameRole.setDef(100);
        gameRole.setVit(100);
        System.out.println("初始状态：");
        gameRole.dispaly();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("战斗后的状态");
        gameRole.setVit(30);
        gameRole.setDef(30);
        gameRole.dispaly();

        System.out.println("战斗后恢复");

        gameRole.recoverGameRole(caretaker.getMemento());

        gameRole.dispaly();
    }
}
