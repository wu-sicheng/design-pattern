package com.wusicheng.e31_observer_pattern.nevv;

/**
 * @author wsc
 * @date 2018/7/17
 * @description
 */

public interface IObserver {
    void update(ISubject subject, Object args);
}
