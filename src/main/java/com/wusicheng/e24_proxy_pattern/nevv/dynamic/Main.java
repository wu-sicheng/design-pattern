package com.wusicheng.e24_proxy_pattern.nevv.dynamic;

import java.lang.reflect.Proxy;

/**
 * @author wsc
 * @date 2018/7/10
 * @description
 */

public class Main {
    public static void main(String[] args) {
        IStation stationProxy = (IStation) Proxy.newProxyInstance(
                Thread.currentThread().getContextClassLoader(),
                new Class[]{IStation.class},
                new StationHandler()
                );
        stationProxy.saleTicket();
        //代理类：com.sun.proxy.$Proxy0调用：com.wusicheng.e24_proxy_pattern.nevv_write.dynamic.StationImpl代理方法：saleTicket
        //火车站卖出一张车票
        //调用结束
    }
}
