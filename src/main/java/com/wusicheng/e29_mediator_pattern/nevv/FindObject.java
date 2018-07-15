package com.wusicheng.e29_mediator_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/15
 * @description
 */

public class FindObject implements Colleague {
    public void findObject() {
        System.out.println("找对象");
    }

    @Override
    public void operation() {
        findObject();
    }
}
