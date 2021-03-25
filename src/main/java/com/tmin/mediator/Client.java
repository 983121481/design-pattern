package com.tmin.mediator;

/**
 * @author
 * @date 2021-02-23 0:43
 */
public class Client {
    public static void main(String[] args) {
        //创建一个中介者对象
        Mediator mediator = new ConcreteMediator();

        //创建Alarm并且加入到ConcreteMediator对象的HashMap
        Alarm alarm = new Alarm(mediator, "alarm");

        //创建CoffeeMachine并且加入到ConcreteMediator对象的HashMap
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");

        //创建Curtains，并且加入到ConcreteMediator对象的HashMap
        Curtains curtains = new Curtains(mediator, "curtains");
        TV tv = new TV(mediator, "TV");

        //让闹钟发出消息
        alarm.sendAlarm(0);

    }
}
