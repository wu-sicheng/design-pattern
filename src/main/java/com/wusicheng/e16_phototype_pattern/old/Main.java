package com.wusicheng.e16_phototype_pattern.old;

/**
 * @author wsc
 * @date 2018/7/2
 * @description 入口
 */

public class Main {
    public static void main(String[] args) {
        //Jack的简历1
        Address jackAddr1 = new Address();
        jackAddr1.setCountry("China");
        jackAddr1.setProvince("Guangdong");
        jackAddr1.setCity("Shenzhen");
        jackAddr1.setStreet("Baoan");

        CV jack1 = new CV();
        jack1.setName("Jack");
        jack1.setAge(24);
        jack1.setSkill("coding");
        jack1.setAddress(jackAddr1);

        //后来Jack搬家，搬到西乡
        Address jackAddr2 = new Address();
        jackAddr2.setCountry("China");
        jackAddr2.setProvince("Guangdong");
        jackAddr2.setCity("Shenzhen");
        jackAddr2.setStreet("Xixiang");

        CV jack2 = new CV();
        jack2.setName("Jack");
        jack2.setAge(24);
        jack2.setSkill("coding");
        jack2.setAddress(jackAddr2);
    }
}
