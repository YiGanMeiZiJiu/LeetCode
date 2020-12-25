package com.leetcode.code.First.String;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class IsUniqueProxy<T> implements InvocationHandler {

    T target;

    public IsUniqueProxy(T target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始代理执行" +method.getName() + "方法");
        Object result = method.invoke(target, args);
        System.out.println("结束代理执行" +method.getName() + "方法");
        return result;
    }
}
