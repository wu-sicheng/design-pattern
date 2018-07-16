package com.wusicheng.e30_memento_pattern.nevv_write;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wsc
 * @date 2018/7/16
 * @description
 */

public class MementoCaretaker {
    private List<HumanMemento> mementos = new ArrayList<>(16);

    public HumanMemento getMemento(int i) {
        return mementos.get(i);
    }

    public void setMemento(HumanMemento memento) {
        mementos.add(memento);
    }
}
