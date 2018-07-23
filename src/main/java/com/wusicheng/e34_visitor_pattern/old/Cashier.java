package com.wusicheng.e34_visitor_pattern.old;

import java.util.List;

/**
 * @author wsc
 * @date 2018/7/23
 * @description
 */

public class Cashier {
    public void cash(List<Good> goods) {
        for(Good good : goods) {
            if(good instanceof FoodGood) {
                good.setPrice(2);
                good.setPacking("塑料袋装");
                System.out.println(good);
            } else if(good instanceof CommonGood) {
                good.setPrice(3);
                good.setPacking("纸袋装");
                System.out.println(good);
            } else {
                System.out.println("===找不到该商品===");
            }
        }
    }
}
