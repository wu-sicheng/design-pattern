package com.wusicheng.e31_observer_pattern.old;

/**
 * @author wsc
 * @date 2018/7/17
 * @description 交通灯
 */

public class TrafficLight {
    private ELightType eLightType;
    private Car car;

    public TrafficLight(Car car) {
        this.car = car;
    }

    public void becomeGreen() {
        eLightType = ELightType.GREEN;
        System.out.println("交通灯变绿了"+eLightType);
        notifyCar();
    }

    public void becomeYellow() {
        eLightType = ELightType.YELLOW;
        System.out.println("交通灯变黄了"+eLightType);
        notifyCar();
    }

    public void becomeRed() {
        eLightType = ELightType.RED;
        System.out.println("交通灯变红了"+eLightType);
        notifyCar();
    }

    public void notifyCar() {
        switch (eLightType) {
            case RED:car.stop();break;
            case GREEN:car.move();break;
            case YELLOW:car.stop();break;
            default:car.stop();
        }
    }

    public enum ELightType {
        GREEN,YELLOW,RED
    }
}
