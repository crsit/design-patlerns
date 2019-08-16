package com.crsit.state;

/**
 * @ClassName: State
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-08-09 11:17
 * @Version: 1.0.0
 **/
public interface State {
    public void deduceMoney();

    public boolean raffle();

    public void dispensePrize();

}
