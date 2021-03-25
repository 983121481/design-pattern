package com.tmin.templatemethod;

/**
 * @author
 * @date 2021-02-19 20:53
 */
public class RedBeanSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        System.out.println("加入上好的红豆");
    }
}
