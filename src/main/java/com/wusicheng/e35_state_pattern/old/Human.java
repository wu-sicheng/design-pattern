package com.wusicheng.e35_state_pattern.old;

/**
 * @author wsc
 * @date 2018/7/24
 * @description
 */

public class Human {
    private String state;
    public Human(String state) {
        this.state = state;
    }
    public void drinkMaidong() {
        if("不在状态".equals(state)) {
            System.out.println("喝脉动");
            this.state = "在状态";
        } else {
            System.out.println("已经在状态了，不要再喝了");
        }
    }

    public void run() {
        if("在状态".equals(state)) {
            System.out.println("跑步");
            this.state = "不在状态";
        } else {
            System.out.println("不喝脉动就跑步，不行呀");
        }
    }

    public void checkState() {
        System.out.println(this.state);
    }
}