package com.tmin.facade;

/**
 * @author
 * @date 2021-02-08 23:00
 */
public class TheaterLight {
    public static TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("TheaterLight on");
    }

    public void off() {
        System.out.println("TheaterLight off");
    }

    public void bright() {
        System.out.println("TheaterLight dim..");
    }

    public void dim() {
        System.out.println("TheaterLight dim..");
    }
}
