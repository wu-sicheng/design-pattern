package com.wusicheng.e14_abstract_factory_pattern.old.product.lunch_box;

/**
 * 方饭盒
 *
 * @author wsc
 * @date 2018/6/28
 * @description
 */

public class SquareLunchBox extends BaseLunchBox {
    @Override
    public String type() {
        return "这是一个方饭盒";
    }
}
