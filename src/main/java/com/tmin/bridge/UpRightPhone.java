package com.tmin.bridge;

/**
 * @author
 * @date 2021-02-08 19:27
 */
public class UpRightPhone extends Phone {

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("直立式手机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("直立式手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("直立式手机");
    }
}
