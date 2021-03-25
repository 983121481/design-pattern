package com.tmin.builder.tradition;

/**
 * @author
 * @date 2021-02-07 22:16
 */
public class Builder {
    public static void main(String[] args) {
        AbstractHouse abstractHouse = new CommonHouse();
        abstractHouse.buildWalls();
    }
}
