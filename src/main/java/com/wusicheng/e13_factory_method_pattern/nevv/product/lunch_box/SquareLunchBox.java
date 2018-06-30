package com.wusicheng.e13_factory_method_pattern.nevv.product.lunch_box;

import com.wusicheng.e13_factory_method_pattern.old.product.BaseProduct;

/**
 * 方饭盒
 *
 * @author wsc
 * @date 2018/6/28
 * @description
 */

public class SquareLunchBox extends BaseProduct {
    @Override
    public String type() {
        return "这是一个方饭盒";
    }
}
