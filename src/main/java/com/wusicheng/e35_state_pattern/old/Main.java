package com.wusicheng.e35_state_pattern.old;

/**
 * @author wsc
 * @date 2018/7/24
 * @description
 */

public class Main {
    static Human human = new Human("不在状态");
    public static void main(String[] args) {
        human.run();
        human.checkState();
        human.drinkMaidong();
        human.checkState();
    }
}
//不喝脉动就跑步，不行呀
//不在状态
//喝脉动
//在状态
