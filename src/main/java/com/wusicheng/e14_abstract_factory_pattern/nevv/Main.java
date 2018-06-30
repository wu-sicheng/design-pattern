package com.wusicheng.e14_abstract_factory_pattern.nevv;

import com.wusicheng.e14_abstract_factory_pattern.nevv.factory.Factory;
import com.wusicheng.e14_abstract_factory_pattern.nevv.factory.IFactory;
import com.wusicheng.e14_abstract_factory_pattern.nevv.product.BaseProduct;

/**
 * @author wsc
 * @date 2018/6/30
 * @description
 */

public class Main {
    public static void main(String[] args) {
        IFactory factory = new Factory();
        BaseProduct cup = factory.buildCup("circleCup");
        System.out.println(cup.type());

        BaseProduct lunchBox = factory.buildLunchBox("squareLunchBox");
        System.out.println(lunchBox.type());
    }
}
