package com.wusicheng.e26_command_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/12
 * @description 命令接口
 */

public interface ICommand {
    /**
     * 执行
     */
    void execute();

    /**
     *  撤销
     */
    void undo();

    /**
     * 重做
     */
    void redo();
}
