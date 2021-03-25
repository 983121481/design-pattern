package com.tmin.factory.tradition.pizza;

/**
 * @author
 * @date 2021-02-04 21:40
 */
public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("给制作奶酪披萨 准备原材料");
    }
}
