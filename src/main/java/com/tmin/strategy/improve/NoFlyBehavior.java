package com.tmin.strategy.improve;

/**
 * @author
 * @date 2021-03-25 16:37
 */
public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞...");
    }
}
