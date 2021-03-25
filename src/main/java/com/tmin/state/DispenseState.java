package com.tmin.state;

/**
 * @author
 * @date 2021-03-25 15:11
 * <p>
 * 发放奖品状态
 */
public class DispenseState implements State {

    private RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("不能扣除积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }

    //发放奖品
    @Override
    public void dispensePrize() {
        if (activity.getCount() > 0) {
            System.out.println("恭喜中奖了");
            //改变状态为不能抽奖
            activity.setState(activity.getNoRaffleState());
        } else {
            System.out.println("很遗憾，奖品发送完了");
            //改变状态为奖品发放完毕，后面我们就不可以抽奖了
            activity.setState(activity.getDispenseOutState());
        }
    }
}
