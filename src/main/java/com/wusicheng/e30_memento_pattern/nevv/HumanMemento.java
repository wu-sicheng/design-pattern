package com.wusicheng.e30_memento_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/16
 * @description
 */

public class HumanMemento {
    /**
     *  年龄
     */
    private int age;

    /**
     *  身高
     */
    private int high;

    /**
     *  体重
     */
    private int weight;

    public HumanMemento(int age, int high, int weight) {
        this.age = age;
        this.high = high;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
