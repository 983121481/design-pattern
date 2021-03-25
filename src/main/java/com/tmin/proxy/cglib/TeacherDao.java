package com.tmin.proxy.cglib;

/**
 * @author
 * @date 2021-02-19 19:56
 */
public class TeacherDao {

    public void teach(){
        System.out.println("老师授课中,我是cglib代理，不需要实现接口");
    }
}
