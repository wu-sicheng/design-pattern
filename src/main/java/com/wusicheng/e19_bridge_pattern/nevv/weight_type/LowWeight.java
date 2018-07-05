package com.wusicheng.e19_bridge_pattern.nevv.weight_type;

/**
 * @author wsc
 * @date 2018/7/5
 * @description
 */

public class LowWeight implements IWeightType {

    @Override
    public void getWeightType() {
        System.out.println("小份");
    }
}
