package com.wusicheng.e17_builder_pattern.old;

/**
 * @author wsc
 * @date 2018/7/3
 * @description 程序主入口
 */

public class Main {
    public static void main(String[] args) {
        // 游戏机
        Computer playStation = new Computer();
        playStation.setCpu("i7");
        playStation.setDisk("ssd");
        playStation.setMemory("12g");
        playStation.setScreen("curve surface");
        playStation.setVideoCard("1080");
        System.out.println(playStation);

        // 普通电脑
        Computer commonComputer = new Computer();
        commonComputer.setCpu("i5");
        commonComputer.setDisk("hhd");
        commonComputer.setMemory("4g");
        commonComputer.setScreen("plane surface");
        commonComputer.setVideoCard("720");
        System.out.println(commonComputer);
    }
}
