package com.wusicheng.e15_singleton_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/1
 * @description
 */

public class SingletonLazyDCLVolatile {
    private volatile static SingletonLazyDCLVolatile instance = null;
    private SingletonLazyDCLVolatile() {}
    public static SingletonLazyDCLVolatile getInstance() {
        if(instance == null) {
            synchronized (SingletonLazyDCL.class) {
                if(instance == null) {
                    instance = new SingletonLazyDCLVolatile();
                }
            }
        }
        return instance;
    }
    public void object() {
        System.out.println("通过SingletonLazyDCLVolatile创建对象");
    }
}
