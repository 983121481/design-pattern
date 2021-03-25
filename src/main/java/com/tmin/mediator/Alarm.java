package com.tmin.mediator;

import com.tmin.composite.College;

/**
 * @author
 * @date 2021-02-22 23:54
 * 具体的同事类
 */
public class Alarm extends Colleague {

    public Alarm(Mediator mediator,String name) {
        super(mediator,name);
        //在创建Alarm同事对象时，将自己放入到ConcreteMediator对象中
        mediator.registor(name,this);
    }

    public void sendAlarm(int stateChange){
        sendMessage(stateChange);
    }

    @Override
    public void sendMessage(int stateChange) {
        //调用的中介者对象的getMessage
        this.getMediator().getMessage(stateChange,this.name);
    }

    public void startAlarm(){
        System.out.println("打开闹钟...");
    }

    public void stopAlarm(){
        System.out.println("关闭闹钟...");
    }
}
