package com.tmin.strategy.improve;

/**
 * @author
 * @date 2021-03-25 16:30
 */
public class Strategy {

    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();

        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.fly();

        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();

        //更改pekingDuck飞行行为
        pekingDuck.setFlyBehavior(new NoFlyBehavior());
        pekingDuck.fly();

    }
}
