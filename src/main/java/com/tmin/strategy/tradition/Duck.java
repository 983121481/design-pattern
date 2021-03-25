package com.tmin.strategy.tradition;

import javax.sound.midi.Soundbank;

/**
 * @author
 * @date 2021-03-25 16:13
 */
public abstract class Duck {

    public abstract void display();

    public void quack() {
        System.out.println("鸭子嘎嘎叫~~~");
    }

    public void swim() {
        System.out.println("鸭子会游泳~~~");
    }

    public void fly() {
        System.out.println("鸭子会飞~~~");
    }

}
