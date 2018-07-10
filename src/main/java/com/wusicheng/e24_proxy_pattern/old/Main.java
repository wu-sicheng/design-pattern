package com.wusicheng.e24_proxy_pattern.old;

/**
 * @author wsc
 * @date 2018/7/10
 * @description
 */

public class Main {
    public static void main(String[] args) {
        IStation station = new StationImpl();
        station.saleTicket();//火车站卖出一张车票
    }
}
