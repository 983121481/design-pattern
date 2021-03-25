package com.tmin.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author
 * @date 2021-02-22 20:46
 */
public class InfoCollegeIterator implements Iterator {

    //信息工程学院是以List方式存放
    List<Department> departmentList;

    //索引
    int index = -1;

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    //判断list中是否还有下一个
    @Override
    public boolean hasNext() {
        if(index>=departmentList.size()-1){
            return false;
        }else {
            return true;
        }
    }

    //获取下一个元素
    @Override
    public Object next() {
        return departmentList.get(++index);
    }

    //空实现remove
    @Override
    public void remove() {

    }
}
