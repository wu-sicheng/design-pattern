package com.wusicheng.e21_decorator_pattern.old;

/**
 * @author wsc
 * @date 2018/7/8
 * @description
 */

public class NativePrinter implements IPrinter {
    @Override
    public void info() {
        System.out.println("====普通的画====");
    }
}
