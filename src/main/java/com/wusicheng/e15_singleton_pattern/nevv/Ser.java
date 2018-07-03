package com.wusicheng.e15_singleton_pattern.nevv;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author wsc
 * @date 2018/7/2
 * @description
 */

public class Ser {
    public static void main(String[] args) {
        Singleton before = Singleton.getInstance();
        try{
            FileOutputStream fos = new FileOutputStream("singleton.out");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(before);

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton.out"));
            Singleton after = (Singleton) ois.readObject();
            ois.close();

            System.out.println(before);
            System.out.println(after);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
