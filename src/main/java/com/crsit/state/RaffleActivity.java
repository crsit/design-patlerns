package com.crsit.state;

/**
 * @ClassName: RaffleActivity
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-08-09 11:24
 * @Version: 1.0.0
 **/
public class RaffleActivity {

    private State state;
    int count = 0;
    State noRaffleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);
    State dispenseState = new DispenseState(this);
    State dispenseOutState = new DispeseOutState(this);

    public RaffleActivity(int count) {
        this.count = count;
        this.state = getNoRaffleState();
    }

    public void debuctMoney() {
        this.state.deduceMoney();
    }

    public void raffle() {
        if(state.raffle())
            state.dispensePrize();
    }

    public void dispensePrize() {
        this.state.dispensePrize();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getNoRaffleState() {
        return this.noRaffleState;
    }

    public State getCanRaffleState() {
        return this.canRaffleState;
    }

    public State getDispenseState() {
        return this.dispenseState;
    }

    public State getDispenseOutState() {
        return this.dispenseOutState;
    }

    public int getCount() {
        return this.count--;
    }
}
