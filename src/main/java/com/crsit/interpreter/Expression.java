package com.crsit.interpreter;

import java.util.HashMap;

/**
 * @ClassName: Expression
 * @Description: 抽象类表达式，通过HashMap键值对可以获取变量的值
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-08-08 22:25
 * @Version: 1.0.0
 **/
public abstract class Expression {
    public abstract int interpreter(HashMap<String, Integer> var);
}
