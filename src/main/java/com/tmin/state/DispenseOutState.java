package com.tmin.state;

/**
 * @author
 * @date 2021-03-25 15:27
 *
 * 奖品发放完毕状态
 * 当我们activity 改变成DispenseOutState，抽奖活动结束
 */
public class DispenseOutState implements State {

    private RaffleActivity active;

    public DispenseOutState(RaffleActivity active) {
        this.active = active;
    }

    @Override
    public void deductMoney() {
        System.out.println("奖品发放完了，请下次再参加");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发放完了，请下次再参加");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发放完了，请下次再参加");
    }
}
