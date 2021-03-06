package com.tmin.state;

import java.sql.SQLOutput;
import java.util.Random;

/**
 * @author
 * @date 2021-03-25 14:57
 * 可以抽奖的状态
 */
public class CanRaffleState implements State {

    private RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    //已经扣除积分，不能再扣
    @Override
    public void deductMoney() {
        System.out.println("已经扣取过了积分");
    }

    //可以抽奖，抽完奖后，根据实际情况，改成新状态
    @Override
    public boolean raffle() {
        System.out.println("正在抽奖，请稍等");
        int num = new Random().nextInt(10);
        //10%中奖机会
        if (num == 0) {
            //改变活动状态为发放奖品context
            activity.setState(activity.getDispenseState());
            return true;
        } else {
            System.out.println("很遗憾没有抽中奖品");
            //改变状态为不能抽奖
            activity.setState(activity.getNoRaffleState());
            return false;
        }

    }

    //不能发放奖品
    @Override
    public void dispensePrize() {
        System.out.println("没中奖，不能发放奖品");
    }
}
