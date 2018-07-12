package com.wusicheng.e26_command_pattern.old;

/**
 * @author wsc
 * @date 2018/7/12
 * @description 客服
 */

public class CustomerService {
    public void service(String type) {
        switch (type){
            case "phoneCharge":
                new PhoneChargeService().answer();
                break;
            case "traffic":
                new TrafficService().answer();
                break;
            default:
                System.out.println("服务不支持");
                break;
        }
    }
}
