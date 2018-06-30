package com.wusicheng.e14_abstract_factory_pattern.old.factory;

import com.wusicheng.e14_abstract_factory_pattern.old.product.lunch_box.BaseLunchBox;

/**
 * 抽象工厂类
 *
 * @author wsc
 * @date 2018/6/29
 * @description
 */

public interface ILunchBoxFactory {
    BaseLunchBox build(String type);
}
