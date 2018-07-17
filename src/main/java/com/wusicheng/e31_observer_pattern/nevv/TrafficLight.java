package com.wusicheng.e31_observer_pattern.nevv;

import java.util.List;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author wsc
 * @date 2018/7/17
 * @description 交通灯
 */

public class TrafficLight implements ISubject{
    private LinkedTransferQueue<IObserver> observers;

    public TrafficLight() {
        this.observers = new LinkedTransferQueue<>();
    }

    private ELightType eLightType;

    public ELightType geteLightType() {
        return eLightType;
    }

    public void seteLightType(ELightType eLightType) {
        this.eLightType = eLightType;
    }

    public void becomeGreen() {
        eLightType = ELightType.GREEN;
        System.out.println("交通灯变绿了"+eLightType);
        notifyObservers();
    }

    public void becomeYellow() {
        eLightType = ELightType.YELLOW;
        System.out.println("交通灯变黄了"+eLightType);
        notifyObservers();
    }

    public void becomeRed() {
        eLightType = ELightType.RED;
        System.out.println("交通灯变红了"+eLightType);
        notifyObservers();
    }

    @Override
    public void addObserver(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void removeObservers() {
        this.observers.clear();
    }

    @Override
    public void notifyObservers(Object args) {
        for(IObserver observer : observers) {
            observer.update(this, args);
        }
    }

    @Override
    public void notifyObservers() {
        notifyObservers(eLightType);
    }


    public enum ELightType {
        GREEN,YELLOW,RED
    }
}
