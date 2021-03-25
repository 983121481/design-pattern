package com.tmin.facade;

/**
 * 立体声
 * @author
 * @date 2021-02-08 22:57
 */
public class Stereo {

    public static Stereo instance = new Stereo();

    public static Stereo getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Stereo on");
    }

    public void off() {
        System.out.println("stereo off");
    }

    public void up() {
        System.out.println("strero up..");
    }

}
