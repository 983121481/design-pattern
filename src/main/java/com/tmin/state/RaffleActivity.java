package com.tmin.state;

import lombok.Data;

/**
 * @author
 * @date 2021-03-25 14:43
 */
@Data
public class RaffleActivity {

    private State state;

    private Integer count;

    private CanRaffleState canRaffleState = new CanRaffleState(this);

    private DispenseState dispenseState = new DispenseState(this);

    private NoRaffleState noRaffleState = new NoRaffleState(this);

    private DispenseOutState dispenseOutState = new DispenseOutState(this);


    //构造器
    //1.初始化当前状态 为 不能抽奖状态
    //2.初始化奖品的数量
    public RaffleActivity(Integer count) {
        this.state = getNoRaffleState();
        this.count = count;
    }

    //扣积分
    public void debuctMoney() {
        state.deductMoney();
    }

    //抽奖
    public void raffle() {
        //如果当前的状态是抽奖成功
        if (state.raffle()) {
             //领取奖品
            state.dispensePrize();
        }
    }

    //注意
    public Integer getCount() {
        int curCount = count;
        count--;
        return curCount;
    }
}
