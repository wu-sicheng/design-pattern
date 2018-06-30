package com.wusicheng.e13_factory_method_pattern.old.product.cup;

import com.wusicheng.e13_factory_method_pattern.old.product.BaseProduct;

/**
 * 圆杯子
 *
 * @author wsc
 * @date 2018/6/28
 * @description
 */

public class CircleCup extends BaseProduct {
    @Override
    public String type() {
        return "这是一个圆杯子";
    }
}
