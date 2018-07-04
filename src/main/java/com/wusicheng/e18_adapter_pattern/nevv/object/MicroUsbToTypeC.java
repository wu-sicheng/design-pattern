package com.wusicheng.e18_adapter_pattern.nevv.object;

/**
 * @author wsc
 * @date 2018/7/4
 * @description
 */

public class MicroUsbToTypeC implements ITypeC{
    private IMicroUsb microUsb;
    public MicroUsbToTypeC(IMicroUsb microUsb) {
        this.microUsb = microUsb;
    }
    public IMicroUsb getMicroUsb() {
        return microUsb;
    }
    @Override
    public void quickFilling() {
        microUsb.slowFilling();
    }
}
