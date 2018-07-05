package com.wusicheng.e19_bridge_pattern.nevv.papper_type;

/**
 * @author wsc
 * @date 2018/7/5
 * @description
 */

public class NoPapper implements IPapperType {

    @Override
    public void getPapperType() {
        System.out.println("不辣");
    }
}
