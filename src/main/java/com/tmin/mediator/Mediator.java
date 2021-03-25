package com.tmin.mediator;

/**
 * @author
 * @date 2021-02-22 23:01
 */
public abstract class Mediator {
    //将中介者对象，加入到集合
    public abstract void registor(String colleagueName,Colleague colleague);

    //接收消息，具体的同事对象发出
    public abstract void getMessage(int stateChange,String colleagueName);

    public abstract void sendMessage();
}
