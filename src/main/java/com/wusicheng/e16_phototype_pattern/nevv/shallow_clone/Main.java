package com.wusicheng.e16_phototype_pattern.nevv.shallow_clone;

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
        jack1.setLevel(1);
        jack1.setAddress(jackAddr1);

        //后来Jack搬家，搬到西乡
        CV jack2 = (CV)jack1.clone();
            jack2.getAddress().setStreet("Xixiang");
            jack2.setAge(26);
            jack2.setName("Mack");
            jack2.setLevel(3);

        System.out.println(jack1.getAddress().getStreet());//Xixiang
        System.out.println(jack2.getAddress().getStreet());//Xixiang
        System.out.println(jack1.getAge());//24
        System.out.println(jack2.getAge());//26
        System.out.println(jack1.getName());//Jack
        System.out.println(jack2.getName());//Mack
        System.out.println(jack1.getLevel());//1
        System.out.println(jack2.getLevel());//3
    }
}
