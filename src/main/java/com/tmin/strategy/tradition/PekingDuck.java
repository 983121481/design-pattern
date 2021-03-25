package com.tmin.strategy.tradition;

/**
 * @author
 * @date 2021-03-25 16:17
 */
public class PekingDuck extends Duck {
    @Override
    public void display() {
        System.out.println("这是北京鸭子...");
    }

    //因为北京鸭不能飞翔，因此需要重写fly
    @Override
    public void fly() {
        System.out.println("北京鸭不能飞翔...");
    }
}
