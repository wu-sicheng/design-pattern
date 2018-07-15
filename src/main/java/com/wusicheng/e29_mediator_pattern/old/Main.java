package com.wusicheng.e29_mediator_pattern.old;

/**
 * @author wsc
 * @date 2018/7/15
 * @description
 */

public class Main {
    public static void main(String[] args) {
        RentRoom rentRoom = new RentRoom();
        BuyRoom buyRoom = new BuyRoom();
        FindObject findObject = new FindObject();

        rentRoom.rentRoom();
        buyRoom.buyRoom();
        findObject.findObject();
    }
}
//租房子
//买房子
//找对象
