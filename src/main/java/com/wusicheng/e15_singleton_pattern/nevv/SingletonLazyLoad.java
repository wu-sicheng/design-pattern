package com.wusicheng.e15_singleton_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/1
 * @description 非线程安全的懒汉式实现
 */

public class SingletonLazyLoad {
    private static SingletonLazyLoad instance = null;
    private SingletonLazyLoad() {
        // 私有构造方法，防止通过new实例化
    }
    public static SingletonLazyLoad getInstance() {
        if(instance == null) {
            instance = new SingletonLazyLoad();
        }
        return instance;
    }
    public void object() {
        System.out.println("通过SingletonLazyLoad创建对象");
    }
}
