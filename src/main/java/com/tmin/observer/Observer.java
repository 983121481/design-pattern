package com.tmin.observer;

/**
 * @author
 * @date 2021-02-22 21:48
 * 观察者接口，由观察者来实现
 */
public interface Observer {
    void update(float temperatrue,float pressure, float humidity);
}
