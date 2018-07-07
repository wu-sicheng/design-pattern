package com.wusicheng.e21_decorator_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/8
 * @description
 */

public class BlackFrameDecorator extends BaseDecorator {
    public BlackFrameDecorator(IPrinter printer) {
        super(printer);
    }

    public void info(){
        super.info();
        System.out.println("装饰了黑色相框的画");
    }

}
