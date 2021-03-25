package com.tmin.composite;

/**
 * @author
 * @date 2021-02-08 21:58
 */
public class Client {
    public static void main(String[] args) {
        //由大到小创建对象

        //学校
        OrganizationComponent university = new University("清华大学", "世界一流大学");

        OrganizationComponent computerCollege = new College("计算机学院", "计算机学院");

        OrganizationComponent infoEngineerCollege = new College("信息工程学院", "信息工程学院");

        computerCollege.add(new Department("软件工程", "软件工程专业不错"));
        computerCollege.add(new Department("网络工程", "网络工程专业不错"));
        computerCollege.add(new Department("计算机科学与技术", "计科是老牌专业"));

        infoEngineerCollege.add(new Department("通讯工程", "通讯工程不好学"));
        infoEngineerCollege.add(new Department("信息工程", "信息工程不好学"));

        //将学院加入到大学中
        university.add(computerCollege);
        university.add(infoEngineerCollege);

        university.print();

    }
}
