package com.wusicheng.e31_observer_pattern.old;

/**
 * @author wsc
 * @date 2018/7/17
 * @description
 */

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight(new Car());
        trafficLight.becomeGreen();
    }
}
//交通灯变绿了GREEN
//汽车开动了true
