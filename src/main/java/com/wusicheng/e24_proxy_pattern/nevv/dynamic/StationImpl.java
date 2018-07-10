package com.wusicheng.e24_proxy_pattern.nevv.dynamic;

/**
 * @author wsc
 * @date 2018/7/10
 * @description
 */

public class StationImpl implements IStation {
    public StationImpl() {
    }

    @Override
    public void saleTicket() {
        System.out.println("火车站卖出一张车票");
    }
}
