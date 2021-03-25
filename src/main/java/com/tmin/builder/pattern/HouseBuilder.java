package com.tmin.builder.pattern;

/**
 * 抽象的建造者
 * @author
 * @date 2021-02-07 22:39
 */
public abstract class HouseBuilder {

    protected House house = new House();

    //将建造的流程写好，抽象的方法
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    //建造好房子后将 产品返回
    public House buildHouse(){
        return house;
    }
}
