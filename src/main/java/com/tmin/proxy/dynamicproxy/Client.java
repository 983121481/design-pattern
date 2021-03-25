package com.tmin.proxy.dynamicproxy;

/**
 * @author
 * @date 2021-02-19 19:27
 */
public class Client {
    public static void main(String[] args) {
        //创建被代理对象
        ITeacherDao target = new TeacherDao();

        //给目标对象创建代理对象
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();

        //proxyInstacne=class com.sun.proxy.$Proxy内存中动态生成了代理对象
        System.out.println("proxyInstacne=" + proxyInstance.getClass());

        //通过代理对象，调用目标对象的方法
        proxyInstance.teach();
    }
}
