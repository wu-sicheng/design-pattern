package com.wusicheng.e35_state_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/24
 * @description
 */

public class Human {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void checkState() {
        this.state.checkState();
    }
}
