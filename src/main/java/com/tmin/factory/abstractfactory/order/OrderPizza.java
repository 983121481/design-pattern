package com.tmin.factory.abstractfactory.order;

import com.tmin.factory.abstractfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author
 * @date 2021-02-04 23:50
 */
public class OrderPizza {

    AbstractFactory abstractFactory;

    //构造器
    public OrderPizza(AbstractFactory abstractFactory){
        setAbstractFactory(abstractFactory);
    }

    private void setAbstractFactory(AbstractFactory abstractFactory) {
        Pizza pizza = null;
        String orderType = ""; //用户输入
        this.abstractFactory = abstractFactory;

        do {
            orderType = getType();
            //abstractFactory 可能是北京工厂子类，也可是伦敦工厂子类
            pizza = abstractFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.bake();
            } else {
                break;
            }
        } while (true);
    }

    private String getType() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("input pizza type:");

            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
