package com.wusicheng.e13_factory_method_pattern.nevv.factory;

import com.wusicheng.e13_factory_method_pattern.old.product.BaseProduct;
import com.wusicheng.e13_factory_method_pattern.old.product.cup.CircleCup;
import com.wusicheng.e13_factory_method_pattern.old.product.cup.SquareCup;

/**
 *
 * 杯子工厂类
 *
 * @author wsc
 * @date 2018/6/28
 * @description
 */

public class CupFactory implements IFactory {
    public BaseProduct build(String type) {
        switch (type){
            case "circleCup": return new CircleCup();
            case "squareCup": return new SquareCup();
            default:return null;
        }
    }
}
