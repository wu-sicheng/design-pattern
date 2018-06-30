package com.wusicheng.e14_abstract_factory_pattern.nevv.factory;

import com.wusicheng.e14_abstract_factory_pattern.nevv.product.BaseProduct;

/**
 * @author wsc
 * @date 2018/6/30
 * @description
 */

public interface IFactory {
    BaseProduct buildCup(String type);

    BaseProduct buildLunchBox(String type);
}
