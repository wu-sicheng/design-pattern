package com.wusicheng.e17_builder_pattern.nevv.builder;

import com.wusicheng.e17_builder_pattern.nevv.Computer;

/**
 * @author wsc
 * @date 2018/7/3
 * @description 电脑装配方案
 */

public abstract class BaseAssemblyScheme {

    protected Computer computer = new Computer();

    public abstract void buildCpu();
    public abstract void buildMemory();
    public abstract void buildDisk();
    public abstract void buildVideoCard();
    public abstract void buildScreen();

    public Computer generteComputer() {
        return computer;
    }
}
