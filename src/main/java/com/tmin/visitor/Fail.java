package com.tmin.visitor;

/**
 * @author
 * @date 2021-02-20 0:22
 */
public class Fail extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给的评价是失败");
    }

    @Override
    public void getWomanResult(Woman man) {
        System.out.println("女人给的评价是失败");
    }
}
