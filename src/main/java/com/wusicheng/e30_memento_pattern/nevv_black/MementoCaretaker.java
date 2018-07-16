package com.wusicheng.e30_memento_pattern.nevv_black;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wsc
 * @date 2018/7/16
 * @description
 */

public class MementoCaretaker {
    private List<IMemento> mementos = new ArrayList<>(16);

    public IMemento getMemento(int i) {
        return mementos.get(i);
    }

    public void setMemento(IMemento memento) {
        mementos.add(memento);
    }
}
