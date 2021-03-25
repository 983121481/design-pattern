package com.tmin.adapter.interfaceadapter;

import com.tmin.singleton.Main;

/**
 * @author
 * @date 2021-02-08 0:12
 */
public class Client {
    public static void main(String[] args) {
        //匿名内部类
        new AbsAdapter(){
            @Override
            public void operator01() {
                System.out.println("hello");
            }
        }.operator01();  
    }
}
