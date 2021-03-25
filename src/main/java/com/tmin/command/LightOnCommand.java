package com.tmin.command;

/**
 * @author
 * @date 2021-02-19 22:53
 */
public class LightOnCommand implements Command {

    //聚合LightReceiver
    LightReceiver light;

    //构造器
    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
