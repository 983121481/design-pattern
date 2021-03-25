package com.tmin.command;

/**
 * @author
 * @date 2021-02-19 22:55
 */
public class LightOffCommand implements Command {
    //聚合LightReceiver
    LightReceiver light;

    //构造器
    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
