package com.wusicheng.e24_proxy_pattern.nevv.common;

/**
 * @author wsc
 * @date 2018/7/10
 * @description
 */

public class StationProxy implements IStation {
    private IStation station;

    @Override
    public void saleTicket() {
        if(station == null) {
            station = new StationImpl();
        }
        System.out.println("连接火车站系统连接");
        station.saleTicket();
        System.out.println("断开火车站系统连接");
    }
}
