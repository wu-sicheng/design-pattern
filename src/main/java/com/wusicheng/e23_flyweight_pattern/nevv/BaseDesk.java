package com.wusicheng.e23_flyweight_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/9
 * @description
 */

public abstract class BaseDesk {
    public abstract String getInfo();
    public void info() {
        System.out.println("桌子信息为：" + this.getInfo());
    }

    public void info(Color color) {
        System.out.println("桌子信息为：" + this.getInfo()+"，颜色为："+color.getColor());
    }
}
