package com.wusicheng.e15_singleton_pattern.nevv;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author wsc
 * @date 2018/7/2
 * @description
 */

public class Ref {
    public static void main(String[] args) {
        try {
            Class<Singleton> single1 = Singleton.class;
            Class<Singleton> single2 = Singleton.class;
            Constructor<Singleton> c1 = single1.getDeclaredConstructor(null);
            Constructor<Singleton> c2 = single2.getDeclaredConstructor(null);
            c1.setAccessible(true);
            c2.setAccessible(true);
            Singleton s1 = c1.newInstance();
            Singleton s2 = c2.newInstance();
            System.out.println(s1);
            System.out.println(s2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
