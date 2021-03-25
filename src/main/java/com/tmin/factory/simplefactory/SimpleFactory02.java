package com.tmin.factory.simplefactory;

import com.tmin.factory.tradition.pizza.CheesePizza;
import com.tmin.factory.tradition.pizza.GreekPizza;
import com.tmin.factory.tradition.pizza.PepperPizza;
import com.tmin.factory.tradition.pizza.Pizza;

/**
 * 简单工厂类
 * @author
 * @date 2021-02-04 22:19
 */
public class SimpleFactory02 {

    /**
     * 根据orderType 返回对应的Pizza对象
     * @param orderType
     * @return
     */
    public static Pizza createPizza(String orderType){
        System.out.println("使用静态工厂模式");
        Pizza pizza = null;
        if("greek".equals(orderType)){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if("cheese".equals(orderType)){
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }else if("pepper".equals(orderType)){
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
}
