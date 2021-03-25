package com.tmin.decorator;

/**
 * 具体的Decorator，这里就是调味品
 * @author
 * @date 2021-02-08 20:35
 */
public class Chocolate extends Decorator {
    public Chocolate(Drink obj) {
        super(obj);
        setDes(" 巧克力 ");
        setPrice(3.0f); //调味品价格
    }
}
