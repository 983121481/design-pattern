package com.tmin.mediator;

/**
 * @author
 * @date 2021-02-23 0:21
 */
public class TV extends Colleague {
    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.registor(name,this);
    }

    public void openTV(int stateChange){
        sendMessage(stateChange);
    }

    @Override
    public void sendMessage(int stateChange) {
        //调用的中介者对象的getMessage
        this.getMediator().getMessage(stateChange,this.name);
    }

    public  void startTv(){
        System.out.println("打开电视...");
    }

    public void stopTv(){
        System.out.println("关闭电视...");
    }
}
