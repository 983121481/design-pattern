package com.tmin.strategy.improve;


/**
 * @author
 * @date 2021-03-25 16:16
 */
public class WildDuck extends Duck {
    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是野鸭....");
    }
}
