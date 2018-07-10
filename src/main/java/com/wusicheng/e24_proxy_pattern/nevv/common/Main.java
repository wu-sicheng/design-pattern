package com.wusicheng.e24_proxy_pattern.nevv.common;

/**
 * @author wsc
 * @date 2018/7/10
 * @description
 */

public class Main {
    public static void main(String[] args) {
        IStation station = new StationProxy();
        station.saleTicket();
        //连接火车站系统连接
        //火车站卖出一张车票
        //断开火车站系统连接
    }
}
