package com.wusicheng.e16_phototype_pattern.old;

/**
 * @author wsc
 * @date 2018/7/2
 * @description 简历
 */

public class CV {
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
}
