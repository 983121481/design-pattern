package com.tmin.adapter.objectdapter;


/**
 * @author
 * @date 2021-02-07 23:30
 */
public class Phone {
    //充电
    public void charging(IVoltage5V iVoltage5V) {
        if(iVoltage5V.output5V()==5){
            System.out.println("电压为5V，可充电...");
        }else {
            System.out.println("电压不为5V，不可充电...");
        }
    }
}
