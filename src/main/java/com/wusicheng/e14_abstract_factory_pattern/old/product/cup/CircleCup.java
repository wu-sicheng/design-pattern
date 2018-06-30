package com.wusicheng.e14_abstract_factory_pattern.old.product.cup;

/**
 * 圆杯子
 *
 * @author wsc
 * @date 2018/6/28
 * @description
 */

public class CircleCup extends BaseCup {
    @Override
    public String type() {
        return "这是一个圆杯子";
    }
}
