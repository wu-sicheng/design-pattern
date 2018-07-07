package com.wusicheng.e21_decorator_pattern.old;

/**
 * @author wsc
 * @date 2018/7/8
 * @description
 */

public class BlackFramePrinter extends FramePrinter {
    public void blackFrame() {
        System.out.println("====装饰了黑色相框的画====");
    }
}
