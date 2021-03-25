package com.tmin.facade;

/**
 * @author
 * @date 2021-02-08 22:55
 */
public class Screen {

    private static Screen instance = new Screen();

    public static Screen getInstance() {
        return instance;
    }

    public void up() {
        System.out.println("Screen up");
    }

    public void down() {
        System.out.println("Scren down");
    }
}
