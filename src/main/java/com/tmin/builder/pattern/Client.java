package com.tmin.builder.pattern;

/**
 * @author
 * @date 2021-02-07 22:50
 */
public class Client {
    public static void main(String[] args) {
        //改普通房子
        CommonHouse commonHouse = new CommonHouse();

        //准备创建房子指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);

        //完成房子，返回产品
        House house = houseDirector.constructHouse();

        //指挥者重新建造房子
        houseDirector.setHouseBuilder(new HighBuilding());
        houseDirector.constructHouse();
    }
}
