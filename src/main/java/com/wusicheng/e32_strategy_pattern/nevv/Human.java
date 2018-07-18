package com.wusicheng.e32_strategy_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/18
 * @description
 */

public class Human {
    private IFood food;

    public Human(IFood food) {
        this.food = food;
    }

    public IFood getFood() {
        return food;
    }

    public void setFood(IFood food) {
        this.food = food;
    }

    public void selectFood() {
        food.selectFood();
    }
}
