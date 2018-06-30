package com.wusicheng.e14_abstract_factory_pattern.old.product.cup;

import com.wusicheng.e14_abstract_factory_pattern.old.product.lunch_box.BaseLunchBox;

/**
 * 方杯子
 *
 * @author wsc
 * @date 2018/6/28
 * @description
 */

public class SquareCup extends BaseCup {
    @Override
    public String type() {
        return "这是一个方杯子";
    }
}
