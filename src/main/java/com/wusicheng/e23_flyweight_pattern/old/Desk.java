package com.wusicheng.e23_flyweight_pattern.old;

/**
 * @author wsc
 * @date 2018/7/9
 * @description
 */

public class Desk {
    private String str;

    public Desk(String str) {
        this.str = str;
    }

    public void info() {
        System.out.println("这是一张桌子"+str);
    }
}
