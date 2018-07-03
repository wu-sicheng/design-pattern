package com.wusicheng.e15_singleton_pattern.nevv;

import java.io.ObjectStreamException;

/**
 * @author wsc
 * @date 2018/7/1
 * @description
 */

public class Singleton2 implements java.io.Serializable{
    private static final Singleton2 instance = new Singleton2();
    private Singleton2() {
        //解决反射创建实例的问题，反射调用后抛出异常
        if (instance != null) {
            throw new RuntimeException();
        }
    }
    public static Singleton2 getInstance() {
        return instance;
    }
    //解决反序列化创建实例的问题，从io流读取对象的时候会调用这个方法，readResolve创建的对象会直接替换io流读取的对象
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
    public void object() {
        System.out.println("通过Singleton2创建对象");
    }
}
