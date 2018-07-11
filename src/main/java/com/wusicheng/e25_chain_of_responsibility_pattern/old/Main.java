package com.wusicheng.e25_chain_of_responsibility_pattern.old;

/**
 * @author wsc
 * @date 2018/7/11
 * @description
 */

public class Main {
    public static void main(String[] args) {
        Record record = new Record(2);
        ILeave departmentManager = new DepartmentManager();
        ILeave businessManager = new BusinessManager();

        if(record.getDay() >= 3) {
            departmentManager.sign(record);
            businessManager.sign(record);
        } else {
            departmentManager.sign(record);
        }
    }
}
//请假：2天
//部门经理同意请假
