package com.tmin.factory.abstractfactory.order;

import com.tmin.factory.abstractfactory.pizza.Pizza;

/**
 * 一个抽象工厂模式的抽象层
 * @author
 * @date 2021-02-04 23:40
 */
public interface AbstractFactory {
    //让下面的子类具体实现
    Pizza createPizza(String orderType);
}
