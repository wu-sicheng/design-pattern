package com.wusicheng.e20_composite_pattern.nevv;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wsc
 * @date 2018/7/7
 * @description
 */

public class Department extends DepartmentStaff {
    private List<DepartmentStaff> children;
    private String name;

    public Department(String name) {
        this.name = name;
        children = new ArrayList<>();
    }

    @Override
    public void info() {
        System.out.println("部门："+name);
        for(DepartmentStaff departmentStaff : getChild()) {
            departmentStaff.info();
        }
    }

    @Override
    public void add(DepartmentStaff departmentStaff) {
        getChild().add(departmentStaff);
    }

    @Override
    public void remove(DepartmentStaff departmentStaff) {
        getChild().remove(departmentStaff);
    }

    @Override
    public List<DepartmentStaff> getChild() {
        return children;
    }

    public void setChildren(List<DepartmentStaff> children) {
        this.children = children;
    }
}
