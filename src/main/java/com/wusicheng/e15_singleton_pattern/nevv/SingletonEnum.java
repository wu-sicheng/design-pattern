package com.wusicheng.e15_singleton_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/1
 * @description 枚举 抗反射
 */

public enum SingletonEnum {
    INSTANCE;
    public void object() {
        System.out.println("通过SingletonEnum创建对象");
    }
}