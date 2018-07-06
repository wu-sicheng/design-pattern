package com.wusicheng.e20_composite_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/7
 * @description
 */

public class Staff extends DepartmentStaff {
    private String name;

    public Staff(String name) {
        this.name = name;
    }

    @Override
    public void info() {
        System.out.println("员工："+name);
    }
}
