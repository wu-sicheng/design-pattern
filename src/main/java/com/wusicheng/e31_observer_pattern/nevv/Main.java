package com.wusicheng.e31_observer_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/17
 * @description
 */

public class Main {
    public static void main(String[] args) {
        ISubject trafficLight = new TrafficLight();
        IObserver car = new Car();

        trafficLight.addObserver(car);
        ((TrafficLight) trafficLight).becomeGreen();
    }
}
//交通灯变绿了GREEN
//汽车开动了true
