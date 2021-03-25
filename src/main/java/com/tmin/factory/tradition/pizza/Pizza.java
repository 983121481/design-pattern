package com.tmin.factory.tradition.pizza;

/**
 * @author
 * @date 2021-02-04 21:36
 */
public abstract class Pizza {

    //名字
    protected String name;

    //准备原材料，不同的披萨不同，因此，做抽象方法
    public abstract void prepare();

    public void bake() {
        System.out.println(name + "baking;");
    }

    public void cut() {
        System.out.println(name + "cutting;");
    }

    //打包
    public void box() {
        System.out.println(name + "box;");
    }

    public void setName(String name){
        this.name = name;
    }
}
