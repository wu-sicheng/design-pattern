package com.wusicheng.e15_singleton_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/1
 * @description 线程安全的懒汉式实现
 */

public class SingletonLazyLoadSyn {
    private static SingletonLazyLoadSyn instance = null;
    private SingletonLazyLoadSyn() {

    }
    public static synchronized SingletonLazyLoadSyn getInstance() {
        if(instance == null) {
            instance = new SingletonLazyLoadSyn();
        }
        return instance;
    }
    public void object() {
        System.out.println("通过SingletonLazyLoadSyn创建对象");
    }
}
