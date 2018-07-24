package com.wusicheng.e35_state_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/24
 * @description
 */

public class TiredState extends State {
    static class SingletonHonlder {
        static  TiredState tiredState = new TiredState();
    }

    public static TiredState getTiredState() {
        return SingletonHonlder.tiredState;
    }

    private TiredState() {
        this.setState("不在状态");
    }
}
