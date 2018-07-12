package com.wusicheng.e26_command_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/12
 * @description
 */

public class PhoneChangeCommand implements ICommand {
    private PhoneChargeService phoneChargeService;
    private boolean change;

    public PhoneChargeService getPhoneChargeService() {
        return phoneChargeService;
    }

    public void setPhoneChargeService(PhoneChargeService phoneChargeService) {
        this.phoneChargeService = phoneChargeService;
    }

    public boolean isChange() {
        return change;
    }

    public void setChange(boolean change) {
        this.change = change;
    }

    public PhoneChangeCommand(PhoneChargeService phoneChargeService) {
        this.phoneChargeService = phoneChargeService;
    }

    @Override
    public void execute() {
        phoneChargeService.answer();
        change = true;
    }

    @Override
    public void undo() {
        if(change) {
            phoneChargeService.undo();
        } else {
            System.out.println("没有操作话费服务，撤销失败");
        }
    }

    @Override
    public void redo() {
        execute();
    }
}
