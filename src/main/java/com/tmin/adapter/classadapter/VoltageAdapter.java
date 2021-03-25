package com.tmin.adapter.classadapter;

/**
 *
 * @author
 * @date 2021-02-07 23:27
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        //获取到220V电压
        int srcV = output220V();
        return srcV/44;
    }
}
