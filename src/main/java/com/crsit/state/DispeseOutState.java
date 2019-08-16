package com.crsit.state;

/**
 * @ClassName: DispeseOutState
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-08-09 11:21
 * @Version: 1.0.0
 **/
public class DispeseOutState implements State {
    private RaffleActivity raffleActivity;

    public DispeseOutState(RaffleActivity raffleActivity){
        this.raffleActivity = raffleActivity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("奖品发送完成，请下次再参加");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发送完了，请下次再参加");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发送完了，请下次再参加");
    }
}
