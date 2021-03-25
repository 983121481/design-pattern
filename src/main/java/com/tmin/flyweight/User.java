package com.tmin.flyweight;

/**
 * @author
 * @date 2021-02-09 0:16
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
