package com.wusicheng.e23_flyweight_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/9
 * @description
 */

public class Main {
    public static void main(String[] args) {
        DeskFactory factory = DeskFactory.getFactory();
        BaseDesk desk1_1 = factory.getDesk("desk1");
        BaseDesk desk1_2 = factory.getDesk("desk1");

        System.out.println(desk1_1==desk1_2);//true
        desk1_1.info();//桌子信息为：桌子1
        desk1_2.info();//桌子信息为：桌子1

        desk1_1.info(new Color("白色"));
        desk1_1.info(new Color("黑色"));
    }
}
