package com.tmin.factory.abstractfactory.order;


import com.tmin.factory.abstractfactory.pizza.BjCheesePizza;
import com.tmin.factory.abstractfactory.pizza.BjPepperPizza;
import com.tmin.factory.abstractfactory.pizza.Pizza;

/**
 * @author
 * @date 2021-02-04 23:42
 */
public class BjFactory implements AbstractFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new BjCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new BjPepperPizza();
        }
        return pizza;
    }
}
