package com.tmin.strategy.improve;


/**
 * @author
 * @date 2021-03-25 16:17
 */
public class PekingDuck extends Duck {

    public PekingDuck() {
        flyBehavior = new BadFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是北京鸭子...");
    }

}
