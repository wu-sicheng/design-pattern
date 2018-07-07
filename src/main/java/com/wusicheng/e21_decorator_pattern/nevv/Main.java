package com.wusicheng.e21_decorator_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/8
 * @description
 */

public class Main {
    public static void main(String[] args) {
        IPrinter nativePrinter = new NativePrinter();
        IPrinter framePrinter = new FrameDecorator(nativePrinter);
        IPrinter blackFramePrinter = new BlackFrameDecorator(framePrinter);
        blackFramePrinter.info();
    }
}
