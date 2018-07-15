package com.wusicheng.e29_mediator_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/15
 * @description
 */

public class RentRoom implements Colleague{
    public void rentRoom() {
        System.out.println("租房子");
    }

    @Override
    public void operation() {
        rentRoom();
    }
}
