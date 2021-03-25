package com.tmin.proxy.cglib;



/**
 * @author
 * @date 2021-02-19 20:08
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        TeacherDao teacherDao = new TeacherDao();
        //通过代理工厂获取代理对象
        TeacherDao proxyInstance = (TeacherDao)new ProxyFactory(teacherDao).getProxyInstance();
        //使用代理对象执行方法
        proxyInstance.teach();
    }
}
