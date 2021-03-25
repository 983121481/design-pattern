package com.tmin.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author
 * @date 2021-02-07 20:42
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sheep implements Cloneable, Serializable {

    private String name;

    private Integer age;

    private String color;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
