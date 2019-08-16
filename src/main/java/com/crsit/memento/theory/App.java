package com.crsit.memento.theory;

/**
 * @ClassName: App
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-08-08 12:02
 * @Version: 1.0.0
 **/
public class App {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("状态1 攻击力：1000");
        caretaker.add(originator.saveStateMemento());
        originator.setState("状态2 攻击力：1200");
        caretaker.add(originator.saveStateMemento());
        originator.setState("状态3 攻击力：900");

        System.out.println("当前状态："+ originator.getState());

        //恢复当前状态到状态1

        originator.resetFromMemento(caretaker.get(0));

        System.out.println("当前状态："+ originator.getState());
    }
}
