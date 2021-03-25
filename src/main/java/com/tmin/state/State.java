package com.tmin.state;

/**
 * @author
 * @date 2021-03-25 14:37
 * 状态接口
 */
public interface State {

    //扣除积分 -50
    void deductMoney();

    //是否抽中奖品
    boolean raffle();

    //发放奖品
    void dispensePrize();
}
