package com.wusicheng.e26_command_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/12
 * @description
 */

public class TrafficCommand implements ICommand {
    private TrafficService trafficService;
    private boolean change;

    public TrafficService getTrafficService() {
        return trafficService;
    }

    public void setTrafficService(TrafficService trafficService) {
        this.trafficService = trafficService;
    }

    public boolean isChange() {
        return change;
    }

    public void setChange(boolean change) {
        this.change = change;
    }

    public TrafficCommand(TrafficService trafficService) {
        this.trafficService = trafficService;
    }

    @Override
    public void execute() {
        trafficService.answer();
        change = true;
    }

    @Override
    public void undo() {
        if(change) {
            trafficService.undo();
        } else {
            System.out.println("流量服务没有操作，不撤回");
        }
    }

    @Override
    public void redo() {
        execute();
    }
}
