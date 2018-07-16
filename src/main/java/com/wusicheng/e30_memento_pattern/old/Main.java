package com.wusicheng.e30_memento_pattern.old;

/**
 * @author wsc
 * @date 2018/7/16
 * @description
 */

public class Main {
    public static void main(String[] args) {
        Human human = new Human(1,12,12);
        human.save();
        human.growUp(2,23,23);
        human.save();

        System.out.println(human);
        human.restore(0);
        System.out.println(human);
    }
}
//Human{age=2, high=23, weight=23}
//Human{age=1, high=12, weight=12}
