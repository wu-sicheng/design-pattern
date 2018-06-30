package com.wusicheng.e14_abstract_factory_pattern.old.product.lunch_box;

/**
 * 圆饭盒
 *
 * @author wsc
 * @date 2018/6/28
 * @description
 */

public class CircleLunchBox extends BaseLunchBox {
    @Override
    public String type() {
        return "这是一个圆饭盒";
    }
}
