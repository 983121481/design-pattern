package com.tmin.factory.tradition.pizza;

/**
 * @author
 * @date 2021-02-04 22:07
 */
public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给胡椒披萨准备原材料");
    }
}
