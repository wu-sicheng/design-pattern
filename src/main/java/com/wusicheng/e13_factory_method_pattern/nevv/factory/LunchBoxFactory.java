package com.wusicheng.e13_factory_method_pattern.nevv.factory;

import com.wusicheng.e13_factory_method_pattern.old.product.BaseProduct;
import com.wusicheng.e13_factory_method_pattern.old.product.cup.CircleCup;
import com.wusicheng.e13_factory_method_pattern.old.product.cup.SquareCup;
import com.wusicheng.e13_factory_method_pattern.old.product.lunch_box.CircleLunchBox;
import com.wusicheng.e13_factory_method_pattern.old.product.lunch_box.SquareLunchBox;

/**
 *
 * 饭盒工厂类
 *
 * @author wsc
 * @date 2018/6/28
 * @description
 */

public class LunchBoxFactory implements IFactory {
    public BaseProduct build(String type) {
        switch (type){
            case "circleLunchBox": return new CircleLunchBox();
            case "squareLunchBox": return new SquareLunchBox();
            default:return null;
        }
    }
}
