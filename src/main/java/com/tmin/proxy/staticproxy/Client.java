package com.tmin.proxy.staticproxy;

/**
 * @author
 * @date 2021-02-09 0:55
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        ITeacherDao teacherDao = new TeacherDao();

        //创建代理对象
        ITeacherDao teacherDaoProxy = new TeacherDaoProxy(teacherDao);

        //通过代理对象 执行方法
        teacherDaoProxy.teach();
    }
}
