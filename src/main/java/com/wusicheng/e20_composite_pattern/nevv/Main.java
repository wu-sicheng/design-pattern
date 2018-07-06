package com.wusicheng.e20_composite_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/7
 * @description
 */

public class Main {
    public static void main(String[] args) {
        DepartmentStaff d1 = new Department("d1");
        DepartmentStaff d1_1 = new Department("d1_1");

        DepartmentStaff s1 = new Staff("s1");
        d1_1.add(s1);
        d1.add(d1_1);
        d1.info();
    }
}
