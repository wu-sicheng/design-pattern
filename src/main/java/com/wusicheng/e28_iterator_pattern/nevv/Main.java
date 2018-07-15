package com.wusicheng.e28_iterator_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/15
 * @description
 */

public class Main {
    public static void main(String[] args) {
        Array array = new Array();
        array.goods[0] = "第一个货物";
        array.goods[1] = "第二个货物";
        array.goods[2] = "第三个货物";

        Iterator iterator = new ConcreteIterator(array);
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
//第一个货物
//第二个货物
//第三个货物