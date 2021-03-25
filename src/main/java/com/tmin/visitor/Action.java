package com.tmin.visitor;

/**
 * @author
 * @date 2021-02-20 0:20
 */
public abstract class Action {
    //得到男性 的测评
    public abstract void getManResult(Man man);

    //得到女性 的测评
    public abstract void getWomanResult(Woman man);
}
