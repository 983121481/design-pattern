package com.tmin.memento;

import lombok.Data;

/**
 * @author
 * @date 2021-02-23 20:00
 */
@Data
public class Memento {

    //攻击力
    private int vit;
    //防御力
    private int def;

    public Memento(int vit, int def) {
        this.vit = vit;
        this.def = def;
    }
}
