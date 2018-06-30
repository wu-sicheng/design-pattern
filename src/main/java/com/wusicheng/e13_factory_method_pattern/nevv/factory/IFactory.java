package com.wusicheng.e13_factory_method_pattern.nevv.factory;

import com.wusicheng.e13_factory_method_pattern.old.product.BaseProduct;

/**
 * 抽象工厂类
 *
 * @author wsc
 * @date 2018/6/29
 * @description
 */

public interface IFactory {
    BaseProduct build(String type);
}
