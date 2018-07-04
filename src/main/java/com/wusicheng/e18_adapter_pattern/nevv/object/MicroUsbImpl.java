package com.wusicheng.e18_adapter_pattern.nevv.object;


/**
 * @author wsc
 * @date 2018/7/4
 * @description
 */

public class MicroUsbImpl implements IMicroUsb {

    @Override
    public void slowFilling() {
        System.out.println("这个是micro-usb的接口，可以慢充");
    }
}