package com.tmin.visitor;

/**
 * @author
 * @date 2021-02-20 0:20
 */
public class Success extends Action {

    @Override
    public void getManResult(Man man) {
        System.out.println("男人给的评价是成功");
    }

    @Override
    public void getWomanResult(Woman man) {
        System.out.println("女人给的评价是成功");
    }
}
