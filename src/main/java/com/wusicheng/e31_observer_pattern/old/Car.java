package com.wusicheng.e31_observer_pattern.old;

/**
 * @author wsc
 * @date 2018/7/17
 * @description
 */

public class Car {
    private boolean isMove = false;

    public boolean isMove() {
        return isMove;
    }

    public void setMove(boolean move) {
        isMove = move;
    }

    public void move() {
        isMove = true;
        System.out.println("汽车开动了"+isMove);
    }

    public void stop() {
        isMove = false;
        System.out.println("汽车停止了"+isMove);
    }
}
