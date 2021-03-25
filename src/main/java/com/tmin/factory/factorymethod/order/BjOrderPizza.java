package com.tmin.factory.factorymethod.order;

import com.tmin.factory.factorymethod.pizza.BjCheesePizza;
import com.tmin.factory.factorymethod.pizza.BjPepperPizza;
import com.tmin.factory.tradition.pizza.Pizza;

/**
 * @author
 * @date 2021-02-04 23:15
 */
public class BjOrderPizza extends OrderPizza {
    @Override
    protected Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if("cheese".equals(orderType)){
            pizza = new BjCheesePizza();
        }else if("pepper".equals(orderType)){
            pizza = new BjPepperPizza();
        }
        return pizza;
    }
}
