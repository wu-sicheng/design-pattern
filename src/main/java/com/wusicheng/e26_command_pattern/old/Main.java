package com.wusicheng.e26_command_pattern.old;

/**
 * @author wsc
 * @date 2018/7/12
 * @description 主入口
 */

public class Main {
    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        service.service("phoneCharge");
    }
}
//话费服务