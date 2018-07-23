package com.wusicheng.e34_visitor_pattern.nevv;

import java.util.List;

/**
 * @author wsc
 * @date 2018/7/23
 * @description
 */

public class Cashier {
    IVistor packingVistor = new PackingVistor();
    IVistor collectMoneyVistor = new CollectMoneyVistor();

    public void cash(List<Good> goods) {
        for(Good good : goods) {
            packingVistor.visit(good);

            good.accept(packingVistor);
            good.accept(collectMoneyVistor);
            System.out.println(good);
        }
    }
}
