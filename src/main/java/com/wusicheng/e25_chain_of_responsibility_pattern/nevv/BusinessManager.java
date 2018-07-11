package com.wusicheng.e25_chain_of_responsibility_pattern.nevv;


/**
 * @author wsc
 * @date 2018/7/11
 * @description
 */

public class BusinessManager extends Handler {

    @Override
    public Handler handle(Record record) {
        if (record.getDay() >=3 ) {
            System.out.println("请假天数："+record.getDay()+"天");
            System.out.println("业务主管同意请假");
        }
        return super.handle(record);
    }
}
