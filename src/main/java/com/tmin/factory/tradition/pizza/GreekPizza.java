package com.tmin.factory.tradition.pizza;

/**
 * @author
 * @date 2021-02-04 21:41
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给希腊披萨准备原材料");
    }
}
