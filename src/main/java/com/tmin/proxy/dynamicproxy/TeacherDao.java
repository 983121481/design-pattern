package com.tmin.proxy.dynamicproxy;

/**
 * @author
 * @date 2021-02-19 19:11
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师正在授课...");
    }
}
