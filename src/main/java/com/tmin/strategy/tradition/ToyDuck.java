package com.tmin.strategy.tradition;

/**
 * @author
 * @date 2021-03-25 16:20
 */
public class ToyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("这是玩具鸭...");
    }

    @Override
    public void quack() {
        System.out.println("玩具鸭不能叫...");
    }

    @Override
    public void swim() {
        System.out.println("玩具鸭不能游泳...");
    }

    @Override
    public void fly() {
        System.out.println("玩具鸭不能飞翔...");
    }
}
