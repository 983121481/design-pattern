package com.tmin.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @author
 * @date 2021-02-20 0:32
 */
public class ObjectStructure {

    //维护了一个集合
    private List<Person> persons = new LinkedList<>();

    //添加到list
    public void attach(Person p) {
        persons.add(p);
    }

    //移除
    public void detach(Person p) {
        persons.remove(p);
    }

    //显示测评情况
    public void display(Action action) {
        for (Person person : persons) {
            person.accept(action);
        }
    }
}
