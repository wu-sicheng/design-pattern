package com.wusicheng.e28_iterator_pattern.old;

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

        System.out.println(array.goods[0]);
        System.out.println(array.goods[1]);
        System.out.println(array.goods[2]);
    }
}
//第一个货物
//第二个货物
//第三个货物