package com.wusicheng.e17_builder_pattern.nevv;

import com.wusicheng.e17_builder_pattern.nevv.builder.CommonAssemblyScheme;
import com.wusicheng.e17_builder_pattern.nevv.builder.PlayStationAssemblyScheme;
import com.wusicheng.e17_builder_pattern.nevv.director.IMajor;
import com.wusicheng.e17_builder_pattern.nevv.director.Major;

/**
 * @author wsc
 * @date 2018/7/3
 * @description 程序主入口
 */

public class Main {
    public static void main(String[] args) {
        //专家，我要一台普通电脑
        IMajor major = new Major(new CommonAssemblyScheme());
        Computer commonComputer = major.construct();
        System.out.println(commonComputer);
        // 专家，我开始吃鸡了，我要一台高级一点的电脑
        major.setBaseAssemblyScheme(new PlayStationAssemblyScheme());
        Computer playStationComputer = major.construct();
        System.out.println(playStationComputer);
    }
}
