package com.wusicheng.e29_mediator_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/15
 * @description
 */

public class Main {
    public static void main(String[] args) {
        Colleague rendRoom = new RentRoom();
        Mediator mediator = new ConcreteMediator();
        mediator.operation(rendRoom);
    }
}
//租房子
//买房子
//找对象
