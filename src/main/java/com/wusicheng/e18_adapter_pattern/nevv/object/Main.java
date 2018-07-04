package com.wusicheng.e18_adapter_pattern.nevv.object;

/**
 * @author wsc
 * @date 2018/7/4
 * @description
 */

public class Main {
    public static void main(String[] args) {
        ITypeC typeC = new MicroUsbToTypeC(new MicroUsbImpl());
        typeC.quickFilling();
    }
}
