package com.tmin.templatemethod;

/**
 * @author
 * @date 2021-02-19 21:08
 */
public class PureSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {

    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
