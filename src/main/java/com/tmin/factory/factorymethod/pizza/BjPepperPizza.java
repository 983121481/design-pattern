package com.tmin.factory.factorymethod.pizza;

import com.tmin.factory.tradition.pizza.Pizza;

/**
 * @author
 * @date 2021-02-04 22:07
 */
public class BjPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京胡椒pizza");
        System.out.println("给北京的胡椒pizza准备原材料");
    }
}
