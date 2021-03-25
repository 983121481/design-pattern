package com.tmin.factory.abstractfactory.order;


import com.tmin.factory.abstractfactory.pizza.*;

/**
 * @author
 * @date 2021-02-04 23:42
 */
public class LdFactory implements AbstractFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new LdCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new LdPepperPizza();
        }
        return pizza;
    }
}
