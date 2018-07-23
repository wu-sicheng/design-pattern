package com.wusicheng.e34_visitor_pattern.old;

import com.wusicheng.e32_strategy_pattern.old.Food;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wsc
 * @date 2018/7/23
 * @description
 */

public class Main {
    public static void main(String[] args) {
        List<Good> goods = new ArrayList<>();
        goods.add(new FoodGood("鱼"));
        goods.add(new CommonGood("塑料袋"));

        Cashier cashier = new Cashier();
        cashier.cash(goods);
    }
}
//Good{name='鱼', price=2, packing='塑料袋装'}
//Good{name='塑料袋', price=3, packing='纸袋装'}
