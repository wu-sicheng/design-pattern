package com.wusicheng.e23_flyweight_pattern.nevv;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wsc
 * @date 2018/7/9
 * @description
 */

public class DeskFactory {
    private static DeskFactory factory = new DeskFactory();
    private static Map<String, BaseDesk> publicDesk;

    public DeskFactory() {
        publicDesk = new HashMap<>(2);
        BaseDesk desk1 = new Desk1();
        BaseDesk desk2 = new Desk2();
        publicDesk.put("desk1", desk1);
        publicDesk.put("desk2", desk2);
    }

    public static DeskFactory getFactory() {
        return factory;
    }

    public static BaseDesk getDesk(String desk) {
        return publicDesk.get(desk);
    }
}
