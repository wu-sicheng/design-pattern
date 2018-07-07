package com.wusicheng.e21_decorator_pattern.old;

/**
 * @author wsc
 * @date 2018/7/8
 * @description
 */

public class FramePrinter extends NativePrinter {
    public void frame() {
        System.out.println("===装饰了相框的画===");
    }
}
