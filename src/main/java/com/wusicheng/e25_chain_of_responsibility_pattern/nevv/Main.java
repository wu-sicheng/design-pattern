package com.wusicheng.e25_chain_of_responsibility_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/11
 * @description
 */

public class Main {
    public static void main(String[] args) {
        // 定义处理者
        Handler depManager = new DepartmentManager();
        Handler bizManager = new BusinessManager();
        // 设置链路
        // depManager --> bizManager
        depManager.setNextHandler(bizManager);
        // 调用方法
        Record record = new Record(7);
        depManager.handle(record);
    }
}
//请假天数：7天
//部门经理同意请假
//请假天数：7天
//业务主管同意请假