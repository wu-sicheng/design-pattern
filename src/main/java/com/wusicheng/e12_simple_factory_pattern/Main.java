package com.wusicheng.e12_simple_factory_pattern;

import com.wusicheng.e12_simple_factory_pattern.cup.BaseCup;
import com.wusicheng.e12_simple_factory_pattern.cup.CircleCup;
import com.wusicheng.e12_simple_factory_pattern.factory.CupFactory;

/**
 * @author wsc
 * @date 2018/6/28
 * @description
 */

public class Main {
    public static void main(String[] args) {
        // 普通调用
        BaseCup cup1 = new CircleCup();
        System.out.println(cup1.cupType());

        // 简单工厂方法调用
        BaseCup cup2 = CupFactory.buildCup("square");
        System.out.println(cup2.cupType());

    }

}
