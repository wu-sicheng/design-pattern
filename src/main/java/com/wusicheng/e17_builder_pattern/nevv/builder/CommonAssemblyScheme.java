package com.wusicheng.e17_builder_pattern.nevv.builder;

/**
 * @author wsc
 * @date 2018/7/3
 * @description 普通电脑的装配方案
 */

public class CommonAssemblyScheme extends BaseAssemblyScheme {
    @Override
    public void buildCpu() {
        computer.setCpu("i5");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("4g");
    }

    @Override
    public void buildDisk() {
        computer.setDisk("ssd");
    }

    @Override
    public void buildVideoCard() {
        computer.setVideoCard("720");
    }

    @Override
    public void buildScreen() {
        computer.setScreen("plane surface");
    }
}
