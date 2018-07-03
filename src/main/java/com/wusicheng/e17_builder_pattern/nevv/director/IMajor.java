package com.wusicheng.e17_builder_pattern.nevv.director;

import com.wusicheng.e17_builder_pattern.nevv.Computer;
import com.wusicheng.e17_builder_pattern.nevv.builder.BaseAssemblyScheme;

/**
 * @author wsc
 * @date 2018/7/3
 * @description
 */

public interface IMajor {
    Computer construct();
    void setBaseAssemblyScheme(BaseAssemblyScheme baseAssemblyScheme);
}
