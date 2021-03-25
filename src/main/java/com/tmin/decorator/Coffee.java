package com.tmin.decorator;

/**
 * @author
 * @date 2021-02-08 20:28
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
