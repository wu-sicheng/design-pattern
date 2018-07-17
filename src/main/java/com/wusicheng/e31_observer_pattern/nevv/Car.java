package com.wusicheng.e31_observer_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/17
 * @description
 */

public class Car implements IObserver {
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

    @Override
    public void update(ISubject subject, Object args) {
        TrafficLight.ELightType type = (TrafficLight.ELightType) args;
        switch (type) {
            case RED:stop();break;
            case GREEN:move();break;
            case YELLOW:stop();break;
            default:stop();
        }
    }
}
