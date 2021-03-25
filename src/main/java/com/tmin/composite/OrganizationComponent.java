package com.tmin.composite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author
 * @date 2021-02-08 21:42
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class OrganizationComponent {

    private String name; //名字
    private String des; //说明

    protected void add(OrganizationComponent organizationComponent){
        //默认实现
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent){
        //默认实现
        throw new UnsupportedOperationException();
    }

    //方法print，做成抽象方法
    protected abstract void print();
}
