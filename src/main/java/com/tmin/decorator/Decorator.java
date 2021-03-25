package com.tmin.decorator;

/**
 * @author
 * @date 2021-02-08 20:26
 */
public class Decorator extends Drink {

    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        return des + " " + getPrice() + "&&" + obj  .getDes();
    }
}
