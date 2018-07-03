package com.wusicheng.e15_singleton_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/1
 * @description 非线程安全 双重检查 允许重排序
 */

public class SingletonLazyDCL {
    private static SingletonLazyDCL instance = null;
    private SingletonLazyDCL() {}
    public static SingletonLazyDCL getInstance() {
        if(instance == null) {
            synchronized (SingletonLazyDCL.class) {
                if(instance == null) {
                    instance = new SingletonLazyDCL();
                }
            }
        }
        return instance;
    }
    public void object() {
        System.out.println("通过SingletonLazyDCL创建对象");
    }
}
