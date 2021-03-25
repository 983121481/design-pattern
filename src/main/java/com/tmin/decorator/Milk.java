package com.tmin.decorator;

/**
 * @author
 * @date 2021-02-08 20:37
 */
public class Milk extends Decorator {
    public Milk(Drink obj) {
        super(obj);
        setDes(" 牛奶 ");
        setPrice(2.0f);
    }
}
