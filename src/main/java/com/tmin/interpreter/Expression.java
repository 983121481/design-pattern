package com.tmin.interpreter;

import java.util.HashMap;

/**
 * @author
 * @date 2021-02-23 20:50
 * 抽象类表达式，通过HashMap 键值对，可以获取到变量的值
 */
public abstract class Expression {

    //解释公式和数值，key就是公式(表达式) 参数[a,b,c],value就是具体值
    //HashMap{a=10,b=20}
    public abstract int interpreter(HashMap<String,Integer> var);
}
