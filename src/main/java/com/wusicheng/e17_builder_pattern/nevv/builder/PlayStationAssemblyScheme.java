package com.wusicheng.e17_builder_pattern.nevv.builder;

/**
 * @author wsc
 * @date 2018/7/3
 * @description 游戏电脑的装配方案
 */

public class PlayStationAssemblyScheme extends BaseAssemblyScheme {
    @Override
    public void buildCpu() {
        computer.setCpu("i7");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("12g");
    }

    @Override
    public void buildDisk() {
        computer.setDisk("hhd");
    }

    @Override
    public void buildVideoCard() {
        computer.setVideoCard("1080");
    }

    @Override
    public void buildScreen() {
        computer.setScreen("curve surface");
    }
}
