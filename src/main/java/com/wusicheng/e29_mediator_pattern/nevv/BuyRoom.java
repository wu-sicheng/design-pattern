package com.wusicheng.e29_mediator_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/15
 * @description
 */

public class BuyRoom implements Colleague {
    public void buyRoom() {
        System.out.println("买房子");
    }

    @Override
    public void operation() {
        buyRoom();
    }
}
