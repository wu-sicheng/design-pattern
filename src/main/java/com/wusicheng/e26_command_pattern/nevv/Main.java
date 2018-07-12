package com.wusicheng.e26_command_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/12
 * @description
 */

public class Main {
    public static void main(String[] args) {
        ICommand phoneCommand = new PhoneChangeCommand(new PhoneChargeService());
        ICommand trafficCommand = new TrafficCommand(new TrafficService());

        Invoker server = new Invoker();
        server.execumentCommand(phoneCommand);
        server.execumentCommand(trafficCommand);
        server.redoCommand();

        server.undoCommand();
        server.undoCommand();
        server.undoCommand();
        server.undoCommand();
    }
}
//话费服务
//流量服务
//流量服务
//撤回流量服务
//撤回流量服务
//撤回话费服务
//没有服务可以撤销
