package com.tmin.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author
 * @date 2021-02-22 21:05
 */
public class OutputImpl {

    //学院集合
    List<College> collegeList;

    public OutputImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    //遍历所有学院，然后调用printDepartment 输出各个学院的系
    public void printCollege() {

        //从colleageList中取出所有学院，Java中的List已经实现Iterator
        Iterator<College> iterator = collegeList.iterator();

        while(iterator.hasNext()){
            //取出一个学院
            College college = iterator.next();
            System.out.println("==="+college.getName()+"===");
            printDepartment(college.createIterator());
        }

    }

    //输出 学院输出系
    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department d = (Department) iterator.next();
            System.out.println(d.getName());
        }
    }
}
