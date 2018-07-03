package com.wusicheng.e16_phototype_pattern.nevv.deep_clone_re;

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
            cv = (CV) super.clone();
            cv.address = this.address.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cv;
    }
}
