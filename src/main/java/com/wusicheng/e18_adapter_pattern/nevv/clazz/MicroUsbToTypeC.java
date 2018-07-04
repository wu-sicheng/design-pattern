package com.wusicheng.e18_adapter_pattern.nevv.clazz;

/**
 * @author wsc
 * @date 2018/7/4
 * @description
 */

public class MicroUsbToTypeC extends MicroUsbImpl implements ITypeC{
    @Override
    public void quickFilling() {
        super.slowFilling();
    }
}
