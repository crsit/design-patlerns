package com.crsit.state;

import java.util.Random;

/**
 * @ClassName: CanRaffleState
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-08-09 11:19
 * @Version: 1.0.0
 **/
public class CanRaffleState implements State {
    private RaffleActivity raffleActivity;

    public CanRaffleState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("已经扣取过积分了");
    }

    @Override
    public boolean raffle() {
        System.out.println("正在抽奖，请稍等");
        Random r = new Random();
        int num = r.nextInt(10);
        if (0 == num) {
            raffleActivity.setState(raffleActivity.getDispenseState());
            return true;
        }else {
            System.out.println("很遗憾没有抽中奖品");
            raffleActivity.setState(raffleActivity.getNoRaffleState());
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("还没抽奖，不能发放奖品");
    }
}
