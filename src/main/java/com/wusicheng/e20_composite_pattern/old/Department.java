package com.wusicheng.e20_composite_pattern.old;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wsc
 * @date 2018/7/6
 * @description
 */

public class Department {
    public String name;
    public List<Staff> staffList = new ArrayList<>();
    public List<Department> departmentList = new ArrayList<>();
    public Department(String name) {
        this.name = name;
    }
    public void addStaff(Staff staff) {
        staffList.add(staff);
    }
    public void removeStaff(Staff staff) {
        staffList.remove(staff);
    }
    public void addDepartment(Department department) {
        departmentList.add(department);
    }
    public void removeDepartment(Department department) {
        departmentList.remove(department);
    }
    public void info() {
        System.out.println(name);
    }
}
