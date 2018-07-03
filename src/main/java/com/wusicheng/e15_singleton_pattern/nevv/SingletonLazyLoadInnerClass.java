package com.wusicheng.e15_singleton_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/1
 * @description 基于内部类的线程安全实现
 */

public class SingletonLazyLoadInnerClass {
    private static class SingletonHolder {
        static final SingletonLazyLoadInnerClass instance = new SingletonLazyLoadInnerClass();
    }
    private SingletonLazyLoadInnerClass(){}
    public static SingletonLazyLoadInnerClass getInstance() {
        return SingletonHolder.instance;
    }
    public void object() {
        System.out.println("通过SingletonLazyLoadInnerClass创建对象");
    }
}
