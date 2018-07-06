package com.wusicheng.e20_composite_pattern.nevv;

import java.util.List;

/**
 * @author wsc
 * @date 2018/7/7
 * @description
 */

public abstract class DepartmentStaff {
    public abstract void info();
    public boolean isDepartment() {
        return false;
    }
    public void add(DepartmentStaff departmentStaff) {
        System.out.println("系统发生错误");
    }
    public void remove(DepartmentStaff departmentStaff) {
        System.out.println("系统发生错误");
    }
    public List<DepartmentStaff> getChild() {
        System.out.println("系统发生错误");
        return null;
    }
}
