package com.tmin.factory.factorymethod.order;

import com.tmin.factory.tradition.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author
 * @date 2021-02-04 23:08
 */
public abstract class OrderPizza {

    //构造方法
    public OrderPizza() {
        String orderType; //订购披萨的类型
        do {
            orderType = getType();
            Pizza pizza = createPizza(orderType); //由子类实现
            //输出pizza 制作过程
            if(pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                break;
            }

        } while (true);
    }

    //写一个方法，可以动态获取客户希望订购的披萨类型
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

    //定义一个抽象方法，createPizza，让各个工厂子类自己实现
    protected abstract Pizza createPizza(String orderType);
}
