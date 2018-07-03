package com.wusicheng.e15_singleton_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/2
 * @description
 */

public class Main {
    public static void main(String[] args) {
        Singleton.getInstance().object();
        Singleton2.getInstance().object();
        SingletonEnum.INSTANCE.object();
        SingletonLazyDCL.getInstance().object();
        SingletonLazyDCLVolatile.getInstance().object();
        SingletonLazyLoad.getInstance().object();
        SingletonLazyLoadInnerClass.getInstance().object();
        SingletonLazyLoadSyn.getInstance().object();
    }
}
