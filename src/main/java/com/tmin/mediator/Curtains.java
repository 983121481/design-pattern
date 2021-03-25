package com.tmin.mediator;

/**
 * @author
 * @date 2021-02-23 0:23
 */
public class Curtains extends Colleague {
    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        mediator.registor(name,this);
    }

    public void openCurtains(int stateChange){
        sendMessage(stateChange);
    }

    @Override
    public void sendMessage(int stateChange) {
        //调用的中介者对象的getMessage
        this.getMediator().getMessage(stateChange,this.name);
    }

    public void upCurtain(){
        System.out.println("挂起窗帘...");
    }

    public void offCurtain(){
        System.out.println("关闭窗帘...");
    }
}
