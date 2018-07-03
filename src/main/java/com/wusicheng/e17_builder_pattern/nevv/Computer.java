package com.wusicheng.e17_builder_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/3
 * @description 电脑
 */

public class Computer {
    /**
     * cpu
     */
    private String cpu;

    /**
     * 内存
     */
    private String memory;

    /**
     * 硬盘
     */
    private String disk;

    /**
     * 显卡
     */
    private String videoCard;

    /**
     * 屏幕
     */
    private String screen;

    public Computer() {
        super();
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computer{");
        sb.append("cpu='").append(cpu).append('\'');
        sb.append(", memory='").append(memory).append('\'');
        sb.append(", disk='").append(disk).append('\'');
        sb.append(", videoCard='").append(videoCard).append('\'');
        sb.append(", screen='").append(screen).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
