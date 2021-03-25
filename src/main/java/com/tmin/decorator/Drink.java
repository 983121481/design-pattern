package com.tmin.decorator;

import lombok.Data;

/**
 * @author
 * @date 2021-02-08 20:26
 */
@Data
public abstract class Drink {
    //描述
    public String des;
    private float price = 0.0f;

    //计算费用的抽象方法
    //子类来实现
    public abstract float cost();
}
