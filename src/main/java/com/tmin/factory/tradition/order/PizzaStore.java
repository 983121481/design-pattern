package com.tmin.factory.tradition.order;

import com.tmin.factory.simplefactory.SimpleFactory;

/**
 * @author
 * @date 2021-02-04 21:49
 * 相当于一个客户端，发出订购
 */
public class PizzaStore {
    public static void main(String[] args) {
        //new OrderPizza();

        //使用简单工厂模式
        //new OrderPizza(new SimpleFactory());
        //System.out.println("退出了程序");

        //使用静态工厂
        new OrderPizza02();
    }
}
