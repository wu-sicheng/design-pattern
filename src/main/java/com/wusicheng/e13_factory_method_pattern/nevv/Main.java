package com.wusicheng.e13_factory_method_pattern.nevv;


import com.wusicheng.e13_factory_method_pattern.nevv.factory.CupFactory;
import com.wusicheng.e13_factory_method_pattern.nevv.factory.IFactory;
import com.wusicheng.e13_factory_method_pattern.nevv.factory.LunchBoxFactory;
import com.wusicheng.e13_factory_method_pattern.old.product.BaseProduct;

/**
 * @author wsc
 * @date 2018/6/28
 * @description
 */

public class Main {
    public static void main(String[] args) {
        IFactory cupFactory = new CupFactory();
        BaseProduct cup = cupFactory.build("circleCup");
        System.out.println(cup.type());

        IFactory lunchBoxFactory = new LunchBoxFactory();
        BaseProduct lunchBox = lunchBoxFactory.build("circleLunchBox");
        System.out.println(lunchBox.type());
    }
}
