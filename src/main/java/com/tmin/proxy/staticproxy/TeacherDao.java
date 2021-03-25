package com.tmin.proxy.staticproxy;

/**
 * @author
 * @date 2021-02-09 0:52
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师授课中...");
    }
}
