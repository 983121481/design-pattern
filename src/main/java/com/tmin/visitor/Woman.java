package com.tmin.visitor;

/**
 * @author
 * @date 2021-02-20 0:19
 */
public class Woman extends Person {
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
