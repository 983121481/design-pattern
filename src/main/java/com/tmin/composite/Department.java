package com.tmin.composite;

/**
 * @author
 * @date 2021-02-08 21:56
 */
public class Department extends OrganizationComponent {

    //集合

    public Department(String name, String des) {
        super(name, des);
    }

    //add,remove就不需要写了，因为他是叶子节点

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
