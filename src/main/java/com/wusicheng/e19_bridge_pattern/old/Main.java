package com.wusicheng.e19_bridge_pattern.old;

import com.wusicheng.e19_bridge_pattern.old.weight_type.IWeightType;
import com.wusicheng.e19_bridge_pattern.old.weight_type.LowWeightNoPapperRiceFlour;

/**
 * @author wsc
 * @date 2018/7/5
 * @description
 */

public class Main {
    public static void main(String[] args) {
        IWeightType food = new LowWeightNoPapperRiceFlour();
        food.weightType();
        ((LowWeightNoPapperRiceFlour) food).getPapperType();
        ((LowWeightNoPapperRiceFlour) food).getFoodType();
    }
}
