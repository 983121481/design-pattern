package com.tmin.factory.tradition.order;

import com.tmin.factory.simplefactory.SimpleFactory;
import com.tmin.factory.tradition.pizza.PepperPizza;
import com.tmin.factory.tradition.pizza.Pizza;
import com.tmin.factory.tradition.pizza.CheesePizza;
import com.tmin.factory.tradition.pizza.GreekPizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author
 * @date 2021-02-04 21:42
 */
public class OrderPizza {

    /*public OrderPizza(){
        Pizza pizza = null;
        String orderType; //订购披萨类型
        do{
            orderType = getType();
            if("greek".equals(orderType)){
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            }else if("cheese".equals(orderType)){
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            }else if("pepper".equals(orderType)){
                pizza = new PepperPizza();
                pizza.setName("胡椒披萨");
            }else {
                break;
            }
            //输出pizza制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }*/

    //定义一个简单工厂对象
    SimpleFactory simpleFactory;

    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory){
        setSimpleFactory(simpleFactory);
    }



    public void setSimpleFactory(SimpleFactory simpleFactory){

        String orderType = ""; //用户输入

        this.simpleFactory = simpleFactory;

        do{
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);

            //输出pizza
            if(pizza != null){ //订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购披萨失败");
                break;
            }
        }while(true);
    }

    //写一个方法，可以动态获取客户希望订购的披萨类型
    private String getType(){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("input pizza type:");

            return br.readLine();
        }catch (IOException e){
            e.printStackTrace();
            return "";
        }
    }
}
