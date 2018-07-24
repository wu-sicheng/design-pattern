package com.wusicheng.e35_state_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/24
 * @description 状态
 */

public abstract class State {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void checkState() {
        System.out.println(state);
    }
}
