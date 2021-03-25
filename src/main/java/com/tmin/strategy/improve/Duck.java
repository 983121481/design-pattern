package com.tmin.strategy.improve;

/**
 * @author
 * @date 2021-03-25 16:13
 */
public abstract class Duck {

    //策略接口
    protected FlyBehavior flyBehavior;

    public abstract void display();

    public void quack() {
        System.out.println("鸭子嘎嘎叫~~~");
    }

    public void swim() {
        System.out.println("鸭子会游泳~~~");
    }

    public void fly() {
        if (flyBehavior != null) {
            flyBehavior.fly();
        }
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
