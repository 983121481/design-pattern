package com.tmin.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @date 2021-02-08 21:53
 */
public class College extends OrganizationComponent {

    List<OrganizationComponent> organizationComponents =  new ArrayList<OrganizationComponent>();

    public College(String name, String des) {
        super(name, des);
    }

    //重新add
    @Override
    protected void add(OrganizationComponent organizationComponent){
        //将来实际业务中，College的add和University中的add 不一定完全相同
        organizationComponents.add(organizationComponent);
    }

    //重新remove方法
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    //print输出University 包含的学院
    @Override
    protected void print() {
        System.out.println("-----------"+getName()+"-----------");
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
}
