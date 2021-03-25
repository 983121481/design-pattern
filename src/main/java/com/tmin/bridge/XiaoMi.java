package com.tmin.bridge;

/**
 * @author
 * @date 2021-02-08 19:16
 */
public class XiaoMi implements Brand {
    @Override
    public void open() {
        System.out.println("小米手机开机了...");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机了...");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话...");
    }
}
