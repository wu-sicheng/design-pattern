package com.wusicheng.e25_chain_of_responsibility_pattern.old;

/**
 * @author wsc
 * @date 2018/7/11
 * @description
 */

public class Record {
    private int day;

    public Record() {
    }

    public Record(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public Record setDay(int day) {
        this.day = day;
        return this;
    }
}
