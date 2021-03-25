package com.tmin.proxy.staticproxy;

/**
 * @author
 * @date 2021-02-09 0:52
 */
public class TeacherDaoProxy implements ITeacherDao {

    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("代理开始...完成某些操作");
        target.teach();
        System.out.println("代理结束...");
    }
}
