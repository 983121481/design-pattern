package com.tmin.factory.factorymethod.pizza;

import com.tmin.factory.tradition.pizza.Pizza;

/**
 * @author
 * @date 2021-02-04 21:40
 */
public class LdCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦的奶酪pizza");
        System.out.println("伦敦的奶酪pizza    准备原材料");
    }
}
