package com.tmin.factory.abstractfactory.pizza;


/**
 * @author
 * @date 2021-02-04 22:07
 */
public class LdPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦胡椒pizza");
        System.out.println("给伦敦的胡椒pizza准备原材料");
    }
}
