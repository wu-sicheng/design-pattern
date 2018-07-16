package com.wusicheng.e30_memento_pattern.old;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wsc
 * @date 2018/7/16
 * @description
 */

public class Human {
    /**
     *  保存点
     */
    private List<Human> saveLocal = new ArrayList<>(16);

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

    public Human(int age, int high, int weight) {
        this.age = age;
        this.high = high;
        this.weight = weight;
    }

    public void growUp(int age, int high, int weight) {
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

    public void save() {
        this.saveLocal.add(new Human(age, high, weight));
    }

    public void restore(int i) {
        if(i < saveLocal.size()) {
            Human human = saveLocal.get(i);
            this.age = human.getAge();
            this.high = human.getHigh();
            this.weight = human.getWeight();
            return;
        }
        System.out.println("没有保存任何副本");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Human{");
        sb.append("age=").append(age);
        sb.append(", high=").append(high);
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }
}
