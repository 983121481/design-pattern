package com.tmin.iterator;

import lombok.Data;

/**
 * @author
 * @date 2021-02-22 20:39
 */
@Data
public class Department {

    private String name;

    private String desc;

    public Department(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
}
