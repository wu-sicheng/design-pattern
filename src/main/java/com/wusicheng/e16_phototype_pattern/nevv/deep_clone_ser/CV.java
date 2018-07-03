package com.wusicheng.e16_phototype_pattern.nevv.deep_clone_ser;

import java.io.*;

/**
 * @author wsc
 * @date 2018/7/2
 * @description 简历
 */

public class CV implements Cloneable, Serializable {
    /**
     * 名字
     */
    private String name;
    /**
     * 年龄
     */
    private int age;

    /**
     * 技能
     */
    private String skill;

    /**
     * 住址
     */
    private Address address;

    public CV() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public CV clone() {
        CV cv = null;
        try {
            // 将对象写入到流
            FileOutputStream fos = new FileOutputStream("clone.out");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this);
            // 从流中写入到对象
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("clone.out"));
            cv = (CV) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cv;
    }
}
