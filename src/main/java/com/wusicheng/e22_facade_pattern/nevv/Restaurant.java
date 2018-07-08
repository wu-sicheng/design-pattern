package com.wusicheng.e22_facade_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/9
 * @description 餐馆
 */

public class Restaurant {
    Market market = new Market();
    Kitchen kitchen = new Kitchen();
    public void orderFood() {
        market.selectFood();
        kitchen.washFood();
        kitchen.cutFood();
        kitchen.fryFood();
        kitchen.stageFood();
    }
}
