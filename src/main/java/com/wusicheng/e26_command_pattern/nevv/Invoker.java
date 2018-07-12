package com.wusicheng.e26_command_pattern.nevv;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wsc
 * @date 2018/7/12
 * @description 客服
 */

public class Invoker {
    private List<ICommand> commands = new ArrayList<>();

    public List<ICommand> getCommands() {
        return commands;
    }

    public void setCommands(List<ICommand> commands) {
        this.commands = commands;
    }

    public void execumentCommand(ICommand command) {
        commands.add(command);
        command.execute();
    }

    public void redoCommand() {
        if(commands.size() > 0) {
            this.getCommands().get(commands.size()-1).redo();
            commands.add(this.commands.get(commands.size()-1));
        } else {
            System.out.println("任务列表当中无任务，不能撤销");
        }
    }

    public void undoCommand(){
        if(commands.size() > 0) {
            this.getCommands().get(commands.size()-1).undo();
            this.getCommands().remove(commands.size()-1);
        } else {
            System.out.println("没有服务可以撤销");
        }
    }
}
