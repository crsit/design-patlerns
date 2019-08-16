package com.crsit.interpreter;

import java.util.HashMap;

/**
 * @ClassName: VarExpression
 * @Description: 变量的解析器，通过变量获取值
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-08-08 22:26
 * @Version: 1.0.0
 **/
public class VarExpression extends Expression {
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
