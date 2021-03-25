package com.tmin.interpreter;

import java.util.HashMap;

/**
 * @author
 * @date 2021-02-23 20:53
 * 变量解释器
 */
public class VarExpression extends Expression {

    private String key; //key=a,key=b,key=c

    public VarExpression(String key) {
        this.key = key;
    }

    //interpreter根据变量名称，返回对应值
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
