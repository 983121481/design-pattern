package com.tmin.interpreter;

import java.util.HashMap;

/**
 * @author
 * @date 2021-02-23 21:04
 * 减法表达式
 */
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    //求出left和right表达式相减后的结果
    @Override
    public int interpreter(HashMap<String,Integer> var){
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
