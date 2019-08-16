package com.crsit.interpreter;

import java.util.HashMap;

/**
 * @ClassName: SymbolExpression
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-08-08 22:26
 * @Version: 1.0.0
 **/
public class SymbolExpression extends Expression {

    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * @param var
     * 自己不解析，交给子类解析
     * @return
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
