package com.tmin.visitor;

/**
 * @author
 * @date 2021-02-20 0:19
 */
public abstract class Person {

    //提供一个方法，让访问者可以访问
    public abstract void accept(Action action);
}
