package com.wusicheng.e14_abstract_factory_pattern.nevv.factory;


import com.wusicheng.e14_abstract_factory_pattern.nevv.product.*;

/**
 * @author wsc
 * @date 2018/6/30
 * @description
 */

public class Factory implements IFactory {

    @Override
    public BaseProduct buildCup(String type) {
        switch (type){
            case "circleCup": return new CircleCup();
            case "squareCup": return new SquareCup();
            default:return null;
        }
    }

    @Override
    public BaseProduct buildLunchBox(String type) {
        switch (type){
            case "circleLunchBox": return new CircleLunchBox();
            case "squareLunchBox": return new SquareLunchBox();
            default:return null;
        }
    }
}
