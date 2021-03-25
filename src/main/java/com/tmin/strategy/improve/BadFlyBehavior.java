package com.tmin.strategy.improve;

/**
 * @author
 * @date 2021-03-25 16:36
 */
public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞翔技术一般...");
    }
}
