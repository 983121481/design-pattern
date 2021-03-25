package com.tmin.mediator;

import java.util.HashMap;

/**
 * @author
 * @date 2021-02-23 0:06
 * 具体的中介者
 */
public class ConcreteMediator extends Mediator {
    //集合，放入所有的同事对象
    private HashMap<String, Colleague> colleagueMap;
    private HashMap<String, String> interMap;

    public ConcreteMediator() {
        colleagueMap = new HashMap<>();
        interMap = new HashMap<>();
    }

    @Override
    public void registor(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);

        if (colleague instanceof Alarm) {
            interMap.put("Alarm", colleagueName);
        } else if (colleague instanceof CoffeeMachine) {
            interMap.put("CoffeeMachine", colleagueName);
        } else if (colleague instanceof TV) {
            interMap.put("TV", colleagueName);
        } else if (colleague instanceof Curtains) {
            interMap.put("Curtains", colleagueName);
        }
    }

    //具体中介者的核心方法
    //1.根据得到的消息，完成对应任务
    //2.中介者在这个方法，协调各个具体的同事对象，完成任务
    @Override
    public void getMessage(int stateChange, String colleagueName) {
        if (colleagueMap.get(colleagueName) instanceof Alarm) {
            if (stateChange == 0) {
                ((CoffeeMachine) colleagueMap.get(interMap.get("CoffeeMachine"))).startCoffee();
                ((TV) colleagueMap.get(interMap.get("TV"))).startTv();
            } else if (stateChange == 1) {
                ((CoffeeMachine) colleagueMap.get(interMap.get("CoffeeMachine"))).startCoffee();
            }
        } else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
            ((TV) colleagueMap.get(interMap.get("TV"))).startTv();
        } else if (colleagueMap.get(colleagueName) instanceof TV) {
            ((TV) colleagueMap.get(interMap.get("TV"))).stopTv();
        } else if (colleagueMap.get(colleagueName) instanceof Curtains) {
            ((CoffeeMachine) colleagueMap.get(interMap.get("CoffeeMachine"))).stopCoffee();
        }
    }

    @Override
    public void sendMessage() {

    }
}
