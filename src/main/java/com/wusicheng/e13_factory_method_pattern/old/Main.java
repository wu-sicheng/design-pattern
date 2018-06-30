package com.wusicheng.e13_factory_method_pattern.old;


import com.wusicheng.e13_factory_method_pattern.old.factory.Factory;
import com.wusicheng.e13_factory_method_pattern.old.product.BaseProduct;

/**
 * @author wsc
 * @date 2018/6/28
 * @description
 */

public class Main {
    public static void main(String[] args) {
        BaseProduct cup = Factory.build("circleCup");
        System.out.println(cup.type());

        BaseProduct lunchBox = Factory.build("circleLunchBox");
        System.out.println(lunchBox.type());
    }
}
