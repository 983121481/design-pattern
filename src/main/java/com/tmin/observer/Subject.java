package com.tmin.observer;

/**
 * @author
 * @date 2021-02-22 22:12
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
