package com.tmin.mediator;

/**
 * @author
 * @date 2021-02-23 0:22
 */
public class CoffeeMachine extends Colleague {
    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.registor(name,this);
    }

    public void openCoffeeMachine(int stateChange){
        sendMessage(stateChange);
    }

    @Override
    public void sendMessage(int stateChange) {
        //调用的中介者对象的getMessage
        this.getMediator().getMessage(stateChange,this.name);
    }

    public void startCoffee(){
        System.out.println("打开咖啡机...");
    }

    public void stopCoffee(){
        System.out.println("关闭咖啡机...");
    }
}
