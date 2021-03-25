package com.tmin.adapter.classadapter;

/**
 * @author
 * @date 2021-02-07 23:32
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("类适配器");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
