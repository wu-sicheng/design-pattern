package com.wusicheng.e16_phototype_pattern.nevv.shallow_clone;

/**
 * @author wsc
 * @date 2018/7/2
 * @description 简历
 */

public class CV implements Cloneable{
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

    /**
     * 等级
     */
    private Integer level;

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

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public CV clone() {
        Object cloneCV = null;
        try {
            cloneCV = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (CV)cloneCV;
    }
}
