package com.tmin.state;

/**
 * @author
 * @date 2021-03-25 15:41
 */
public class Client {
    public static void main(String[] args) {

        //创建活动对象，有1个奖品
        RaffleActivity activity = new RaffleActivity(1);

        //连续抽30次
        for (int i = 0; i < 30; i++) {
            System.out.println("-----第"+(i+1)+"次抽奖-------");
            //参加抽奖，第一步点击扣除积分
            activity.debuctMoney();

            //第二步抽奖
            activity.raffle();
        }
    }
}
