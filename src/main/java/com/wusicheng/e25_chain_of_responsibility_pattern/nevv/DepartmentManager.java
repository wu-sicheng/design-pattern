package com.wusicheng.e25_chain_of_responsibility_pattern.nevv;


/**
 * @author wsc
 * @date 2018/7/11
 * @description
 */

public class DepartmentManager extends Handler {
    @Override
    public Handler handle(Record record) {
        System.out.println("请假天数："+record.getDay()+"天");
        System.out.println("部门经理同意请假");
        return super.handle(record);
    }
}
