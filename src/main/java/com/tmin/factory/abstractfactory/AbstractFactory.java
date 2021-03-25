package com.tmin.factory.abstractfactory;

import com.tmin.factory.abstractfactory.order.BjFactory;
import com.tmin.factory.abstractfactory.order.OrderPizza;
import com.tmin.factory.factorymethod.pizza.BjCheesePizza;

/**
 * @author
 * @date 2021-02-04 23:36
 */
public class AbstractFactory {
    public static void main(String[] args) {
        new OrderPizza(new BjFactory());
    }
}
