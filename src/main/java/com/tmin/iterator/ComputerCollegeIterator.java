package com.tmin.iterator;

import java.util.Iterator;

/**
 * @author
 * @date 2021-02-22 20:41
 */
public class ComputerCollegeIterator implements Iterator {

    //需要知道Department是以怎样的方式存放
    Department[] departments;
    int position = 0; //遍历的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }


    @Override
    public boolean hasNext() {
        if(position>=departments.length||departments[position]==null){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        return departments[position++];
    }

    //删除方法，默认空实现
    @Override
    public void remove() {

    }
}
