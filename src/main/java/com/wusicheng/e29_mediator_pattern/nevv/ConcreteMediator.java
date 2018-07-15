package com.wusicheng.e29_mediator_pattern.nevv;


/**
 * @author wsc
 * @date 2018/7/15
 * @description
 */

public class ConcreteMediator implements Mediator {

    @Override
    public void operation(Colleague colleague) {
        colleague.operation();
    }
}
