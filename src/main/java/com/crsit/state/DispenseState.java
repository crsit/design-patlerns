package com.crsit.state;

/**
 * @ClassName: DispenseState
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-08-09 11:20
 * @Version: 1.0.0
 **/
public class DispenseState implements State {
    private RaffleActivity raffleActivity;

    public DispenseState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }
    @Override
    public void deduceMoney() {
        System.out.println("不能扣除积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        if (raffleActivity.getCount()>0){
            System.out.println("恭喜中奖了");
            raffleActivity.setState(raffleActivity.getNoRaffleState());
        }else {
            System.out.println("很遗憾，奖品发完了");
            raffleActivity.setState(raffleActivity.getDispenseOutState());
        }
    }
}
