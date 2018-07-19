package com.wusicheng.e33_template_method_pattern.old;

/**
 * @author wsc
 * @date 2018/7/19
 * @description
 */

public class Main {
    static PPT1 ppt1 = new PPT1();
    static PPT2 ppt2 = new PPT2();


    public static void main(String[] args) {
        ppt1.outlook();
        ppt1.writePPT();

        ppt2.outlook();
        ppt2.writePPT();
    }
}
//选择模板
//写PPT1
//选择模板
//写PPT2
