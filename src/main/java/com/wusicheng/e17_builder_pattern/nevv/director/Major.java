package com.wusicheng.e17_builder_pattern.nevv.director;

import com.wusicheng.e17_builder_pattern.nevv.Computer;
import com.wusicheng.e17_builder_pattern.nevv.builder.BaseAssemblyScheme;

/**
 * @author wsc
 * @date 2018/7/3
 * @description 专业人士
 */

public class Major implements IMajor{
    private BaseAssemblyScheme baseAssemblyScheme;

    public Major(BaseAssemblyScheme baseAssemblyScheme) {
        this.baseAssemblyScheme = baseAssemblyScheme;
    }

    @Override
    public void setBaseAssemblyScheme(BaseAssemblyScheme baseAssemblyScheme) {
        this.baseAssemblyScheme = baseAssemblyScheme;
    }

    @Override
    public Computer construct() {
        baseAssemblyScheme.buildCpu();
        baseAssemblyScheme.buildDisk();
        baseAssemblyScheme.buildMemory();
        baseAssemblyScheme.buildScreen();
        baseAssemblyScheme.buildVideoCard();
        return baseAssemblyScheme.generteComputer();
    }
}
