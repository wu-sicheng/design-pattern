package com.wusicheng.e24_proxy_pattern.nevv.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author wsc
 * @date 2018/7/10
 * @description
 */

public class StationHandler implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj = new StationImpl();
        System.out.println("代理类：" + proxy.getClass().getName()
                + "调用："+obj.getClass().getName()
                + "代理方法："+method.getName());
        Object invoke = method.invoke(obj, args);
        System.out.println("调用结束");
        return invoke;
    }
}
