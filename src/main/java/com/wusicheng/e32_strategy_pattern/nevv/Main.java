package com.wusicheng.e32_strategy_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/18
 * @description
 */

public class Main {
    public static void main(String[] args) {
        IFood food = new AFood();
        Human human = new Human(food);
        human.selectFood();
    }
}
