package com.wusicheng.e15_singleton_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/1
 * @description 非线程安全的饿汉式实现
 */

public class Singleton implements java.io.Serializable {
    private static final Singleton instance = new Singleton();
    private Singleton() {
        // 私有构造方法，防止通过new实例化
    }
    public static Singleton getInstance() {
        return instance;
    }
    public void object() {
        System.out.println("通过Singleton创建对象");
    }
}
