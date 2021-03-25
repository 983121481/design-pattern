package com.tmin.factory.tradition.order;

import com.tmin.factory.simplefactory.SimpleFactory;
import com.tmin.factory.simplefactory.SimpleFactory02;
import com.tmin.factory.tradition.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author
 * @date 2021-02-04 21:42
 */
public class OrderPizza02 {

    public OrderPizza02(){
        String orderType = "";
        do{
            orderType = getType();
            Pizza pizza = SimpleFactory02.createPizza(orderType);
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
