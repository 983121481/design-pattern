package com.tmin.decorator;

/**
 * @author
 * @date 2021-02-08 20:38
 */
public class Soy extends Decorator {
    public Soy(Drink obj) {
        super(obj);
        setDes(" 豆浆 ");
        setPrice(1.5f);
    }
}
