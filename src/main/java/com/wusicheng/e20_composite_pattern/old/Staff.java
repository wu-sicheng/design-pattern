package com.wusicheng.e20_composite_pattern.old;

/**
 * @author wsc
 * @date 2018/7/6
 * @description
 */

public class Staff {
    private String name;
    public Staff(String name) {
        this.name = name;
    }
    public void info() {
        System.out.println(name);
    }
}
