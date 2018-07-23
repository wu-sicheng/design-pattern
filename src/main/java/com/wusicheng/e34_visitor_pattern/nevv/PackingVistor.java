package com.wusicheng.e34_visitor_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/23
 * @description
 */

public class PackingVistor implements IVistor {
    @Override
    public void visit(Good good) {
        if(good instanceof FoodGood) {
            good.setPacking("塑料袋装");
        } else if(good instanceof CommonGood) {
            good.setPacking("纸袋装");
        } else {
            System.out.println("===找不到该商品===");
        }
    }
}
