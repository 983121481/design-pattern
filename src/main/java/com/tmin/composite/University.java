package com.tmin.composite;

import javax.lang.model.element.VariableElement;
import java.util.ArrayList;
import java.util.List;

/**
 * University就是Composite，可以管理Collage
 * @author
 * @date 2021-02-08 21:46
 */
public class University extends OrganizationComponent {

    List<OrganizationComponent> organizationComponents =  new ArrayList<OrganizationComponent>();

    public University(String name, String des) {
        super(name, des);
    }

    //重新add
    @Override
    protected void add(OrganizationComponent organizationComponent){
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
