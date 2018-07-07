package com.wusicheng.e21_decorator_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/8
 * @description
 */

public abstract class BaseDecorator implements IPrinter {
    private IPrinter printer;

    public BaseDecorator(IPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void info() {
        printer.info();
    }
}
