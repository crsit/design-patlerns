package com.crsit.state;

/**
 * @ClassName: NoRaffleState
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-08-09 11:19
 * @Version: 1.0.0
 **/
public class NoRaffleState implements State {
    private  RaffleActivity raffleActivity;

    public NoRaffleState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }
    @Override
    public void deduceMoney() {
        System.out.println("扣除50积分成功，你可以抽奖了");
        raffleActivity.setState(raffleActivity.getCanRaffleState());
    }

    @Override
    public boolean raffle() {
        System.out.println("扣除积分后才能抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品");
    }
}
