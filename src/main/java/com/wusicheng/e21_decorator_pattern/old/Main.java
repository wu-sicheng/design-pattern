package com.wusicheng.e21_decorator_pattern.old;

/**
 * @author wsc
 * @date 2018/7/8
 * @description
 */

public class Main {
    public static void main(String[] args) {
        // 普通的画
        IPrinter nativePrinter = new NativePrinter();
        nativePrinter.info();
        // 装饰了相框的画
        IPrinter framePrinter = new FramePrinter();
        framePrinter.info();
        ((FramePrinter) framePrinter).frame();
        // 装饰了黑色相框的画
        IPrinter blackFramePrinter = new BlackFramePrinter();
        blackFramePrinter.info();
        ((BlackFramePrinter) blackFramePrinter).frame();
        ((BlackFramePrinter) blackFramePrinter).blackFrame();
    }
}
