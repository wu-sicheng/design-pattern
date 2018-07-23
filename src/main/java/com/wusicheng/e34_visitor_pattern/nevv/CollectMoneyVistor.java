package com.wusicheng.e34_visitor_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/23
 * @description
 */

public class CollectMoneyVistor implements IVistor {
    @Override
    public void visit(Good good) {
        if(good instanceof FoodGood) {
            good.setPrice(2);
        } else if(good instanceof CommonGood) {
            good.setPrice(3);
        } else {
            System.out.println("===找不到该商品===");
        }
    }
}
