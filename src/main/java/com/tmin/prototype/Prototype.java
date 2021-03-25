package com.tmin.prototype;

/**
 * @author
 * @date 2021-02-07 20:33
 */
public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException {

        ManagerSheep managerSheep = new ManagerSheep("张三", new Sheep("小羊123", 23, "white"));
        ManagerSheep clone = (ManagerSheep) managerSheep.deepClone();

        System.out.println("before-managerSheep：" + managerSheep);
        System.out.println("before-clone：" + clone);

        clone.getSheep().setName("大羊");
        System.out.println("after-managerSheep：" + managerSheep);
        System.out.println("after-clone：" + clone);

    }
}
