package com.tmin.facade;

/**
 * @author
 * @date 2021-02-08 23:01
 */
public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.end();
    }
}
