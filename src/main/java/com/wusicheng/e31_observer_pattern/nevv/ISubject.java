package com.wusicheng.e31_observer_pattern.nevv;

import java.util.List;

/**
 * @author wsc
 * @date 2018/7/17
 * @description
 */

public interface ISubject {
    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void removeObservers();
    void notifyObservers(Object args);
    void notifyObservers();
}
