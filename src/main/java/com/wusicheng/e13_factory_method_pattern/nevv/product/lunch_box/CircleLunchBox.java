package com.wusicheng.e13_factory_method_pattern.nevv.product.lunch_box;

import com.wusicheng.e13_factory_method_pattern.old.product.BaseProduct;

/**
 * 圆饭盒
 *
 * @author wsc
 * @date 2018/6/28
 * @description
 */

public class CircleLunchBox extends BaseProduct {
    @Override
    public String type() {
        return "这是一个圆饭盒";
    }
}
