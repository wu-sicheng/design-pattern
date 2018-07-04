package com.wusicheng.e18_adapter_pattern.old;

/**
 * @author wsc
 * @date 2018/7/4
 * @description
 */

public class TypeCImpl implements ITypeC {
    IMicroUsb microUsb = new MicroUsbImpl();

    @Override
    public void quickFilling() {
        microUsb.slowFilling();
        //System.out.println("这是type-c的接口，可以快充");
    }
}
