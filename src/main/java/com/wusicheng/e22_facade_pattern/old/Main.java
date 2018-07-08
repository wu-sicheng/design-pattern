package com.wusicheng.e22_facade_pattern.old;

/**
 * @author wsc
 * @date 2018/7/9
 * @description
 */

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Kitchen kitchen = new Kitchen();

        market.selectFood();
        kitchen.cutFood();
        kitchen.washFood();
        kitchen.fryFood();
        kitchen.stageFood();
    }
}
