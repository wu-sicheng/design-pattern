package com.wusicheng.e12_simple_factory_pattern.factory;

import com.wusicheng.e12_simple_factory_pattern.cup.BaseCup;
import com.wusicheng.e12_simple_factory_pattern.cup.CircleCup;
import com.wusicheng.e12_simple_factory_pattern.cup.SquareCup;

/**
 *
 * 杯子工厂类
 *
 * @author wsc
 * @date 2018/6/28
 * @description
 */

public class CupFactory {
    public static BaseCup buildCup(String type) {
        switch (type){
            case "circle": return new CircleCup();
            case "square": return new SquareCup();
            default:return null;
        }
    }
}
