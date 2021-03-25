package com.tmin.bridge;

/**
 * @author
 * @date 2021-02-08 19:18
 */
public abstract class Phone {

    //组合品牌
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open(){
        brand.open();
    }

    protected void close(){
        brand.close();
    }

    protected void call(){
        brand.call();
    }
}
