package com.wusicheng.e25_chain_of_responsibility_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/11
 * @description
 */

public abstract class Handler {
    private Handler nextHandler;

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public Handler handle(Record record) {
        if(nextHandler == null) {
            return null;
        }
        return nextHandler.handle(record);
    }
}
