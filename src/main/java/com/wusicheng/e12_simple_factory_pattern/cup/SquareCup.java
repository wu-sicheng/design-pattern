package com.wusicheng.e12_simple_factory_pattern.cup;

/**
 * 方杯子
 *
 * @author wsc
 * @date 2018/6/28
 * @description
 */

public class SquareCup extends BaseCup {
    @Override
    public String cupType() {
        return "这是一个方杯子";
    }
}
