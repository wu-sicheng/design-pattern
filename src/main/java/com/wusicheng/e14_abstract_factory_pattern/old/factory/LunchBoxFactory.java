package com.wusicheng.e14_abstract_factory_pattern.old.factory;

import com.wusicheng.e14_abstract_factory_pattern.old.product.lunch_box.BaseLunchBox;
import com.wusicheng.e14_abstract_factory_pattern.old.product.lunch_box.CircleLunchBox;
import com.wusicheng.e14_abstract_factory_pattern.old.product.lunch_box.SquareLunchBox;

/**
 *
 * 饭盒工厂类
 *
 * @author wsc
 * @date 2018/6/28
 * @description
 */

public class LunchBoxFactory implements ILunchBoxFactory {
    public BaseLunchBox build(String type) {
        switch (type){
            case "circleLunchBox": return new CircleLunchBox();
            case "squareLunchBox": return new SquareLunchBox();
            default:return null;
        }
    }
}
