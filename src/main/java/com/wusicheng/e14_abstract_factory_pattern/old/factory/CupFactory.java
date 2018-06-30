package com.wusicheng.e14_abstract_factory_pattern.old.factory;

import com.wusicheng.e14_abstract_factory_pattern.old.product.cup.BaseCup;
import com.wusicheng.e14_abstract_factory_pattern.old.product.cup.CircleCup;
import com.wusicheng.e14_abstract_factory_pattern.old.product.cup.SquareCup;

/**
 *
 * 杯子工厂类
 *
 * @author wsc
 * @date 2018/6/28
 * @description
 */

public class CupFactory implements ICupFactory {
    public BaseCup build(String type) {
        switch (type){
            case "circleCup": return new CircleCup();
            case "squareCup": return new SquareCup();
            default:return null;
        }
    }
}
