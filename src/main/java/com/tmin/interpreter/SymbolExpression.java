package com.tmin.interpreter;

import java.util.HashMap;

/**
 * @author
 * @date 2021-02-23 20:55
 * 抽象运算符合解释器 这里，每个运算符号，都只和自己左右两个数字有关系
 * 但左右两个数字也有可能是一个解析的结果，无论何种类型，都是Expression类型的实现类
 */
public class SymbolExpression extends Expression {

    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    //因为SymbolExpression是让其子类来实现，因此interpreter是一个默认实现
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
