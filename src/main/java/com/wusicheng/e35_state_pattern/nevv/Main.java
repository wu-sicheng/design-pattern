package com.wusicheng.e35_state_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/24
 * @description
 */

public class Main {
    static Human human = new Human();
    public static void main(String[] args) {
        human.setState(TiredState.getTiredState());
        human.checkState();
        human.setState(WakeUpState.getTiredState());
        human.checkState();
    }
}
//不在状态
//在状态
