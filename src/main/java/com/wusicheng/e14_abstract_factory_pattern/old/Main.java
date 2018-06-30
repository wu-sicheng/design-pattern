package com.wusicheng.e14_abstract_factory_pattern.old;


import com.wusicheng.e14_abstract_factory_pattern.old.factory.ILunchBoxFactory;
import com.wusicheng.e14_abstract_factory_pattern.old.product.cup.BaseCup;
import com.wusicheng.e14_abstract_factory_pattern.old.product.lunch_box.BaseLunchBox;
import com.wusicheng.e14_abstract_factory_pattern.old.factory.CupFactory;
import com.wusicheng.e14_abstract_factory_pattern.old.factory.ICupFactory;
import com.wusicheng.e14_abstract_factory_pattern.old.factory.LunchBoxFactory;

/**
 * @author wsc
 * @date 2018/6/28
 * @description
 */

public class Main {
    public static void main(String[] args) {
        ICupFactory cupFactory = new CupFactory();
        BaseCup cup = cupFactory.build("circleCup");
        System.out.println(cup.type());

        ILunchBoxFactory lunchBoxFactory = new LunchBoxFactory();
        BaseLunchBox lunchBox = lunchBoxFactory.build("circleLunchBox");
        System.out.println(lunchBox.type());
    }
}
