package com.wusicheng.e28_iterator_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/15
 * @description
 */

public class ConcreteIterator implements Iterator {
    private Array array;
    private int cursor;

    public ConcreteIterator(Array array) {
        cursor = 0;
        this.array = array;
    }

    @Override
    public String first() {
        cursor = 0;
        return array.goods[cursor];
    }

    @Override
    public String next() {
        String currentItem = array.goods[cursor];
        cursor ++;
        return currentItem;
    }

    @Override
    public boolean hasNext() {
        if(array.goods[cursor] != null) {
            return true;
        }
        return false;
    }
}
