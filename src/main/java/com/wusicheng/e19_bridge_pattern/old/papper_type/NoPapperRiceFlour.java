package com.wusicheng.e19_bridge_pattern.old.papper_type;

import com.wusicheng.e19_bridge_pattern.old.food_type.RiceFlour;

/**
 * @author wsc
 * @date 2018/7/5
 * @description
 */

public class NoPapperRiceFlour extends RiceFlour implements IPapperType {
    @Override
    public void getPapperType() {
        System.out.println("不辣");
    }
}
