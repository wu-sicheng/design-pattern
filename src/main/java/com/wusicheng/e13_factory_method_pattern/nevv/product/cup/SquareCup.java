package com.wusicheng.e13_factory_method_pattern.nevv.product.cup;

import com.wusicheng.e13_factory_method_pattern.old.product.BaseProduct;

/**
 * 方杯子
 *
 * @author wsc
 * @date 2018/6/28
 * @description
 */

public class SquareCup extends BaseProduct {
    @Override
    public String type() {
        return "这是一个方杯子";
    }
}
