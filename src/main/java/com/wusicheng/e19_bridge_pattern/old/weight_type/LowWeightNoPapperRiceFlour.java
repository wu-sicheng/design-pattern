package com.wusicheng.e19_bridge_pattern.old.weight_type;

import com.wusicheng.e19_bridge_pattern.old.papper_type.NoPapperRiceFlour;

/**
 * @author wsc
 * @date 2018/7/5
 * @description
 */

public class LowWeightNoPapperRiceFlour extends NoPapperRiceFlour implements IWeightType {
    @Override
    public void weightType() {
        System.out.println("小份");
    }
}
