package com.wusicheng.e35_state_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/24
 * @description
 */

public class WakeUpState extends State {
    static class SingletonHonlder {
        static WakeUpState wakeUpState = new WakeUpState();
    }

    public static WakeUpState getTiredState() {
        return SingletonHonlder.wakeUpState;
    }

    private WakeUpState() {
        this.setState("在状态");
    }
}
