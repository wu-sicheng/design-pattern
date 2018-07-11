package com.wusicheng.e25_chain_of_responsibility_pattern.old;

/**
 * @author wsc
 * @date 2018/7/11
 * @description
 */

public class DepartmentManager implements ILeave {
    @Override
    public void sign(Record record) {
        System.out.println("请假：" + record.getDay() + "天");
        System.out.println("部门经理同意请假");
    }
}
