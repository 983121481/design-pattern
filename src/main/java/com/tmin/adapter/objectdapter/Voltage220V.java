package com.tmin.adapter.objectdapter;

/**
 * @author
 * @date 2021-02-07 23:46
 */
public class Voltage220V {
    //输出220V电压
    public int output220V() {
        int src = 220;
        System.out.println("电压为：" + src + "伏");
        return src;
    }
}
