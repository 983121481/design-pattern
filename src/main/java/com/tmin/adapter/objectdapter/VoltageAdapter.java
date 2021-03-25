package com.tmin.adapter.objectdapter;

/**
 * @author
 * @date 2021-02-07 23:46
 */
public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (null != voltage220V) {
            System.out.println("使用对象适配器，进行适配");
            //获取220V电压
            int src = voltage220V.output220V();
            dst = src / 44;
            System.out.println("适配完成，输出的电压为：" + dst);
        }
        return dst;
    }
}
