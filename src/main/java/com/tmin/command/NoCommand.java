package com.tmin.command;

/**
 * 没有任何命令，即空执行，初始化某个按钮，当调用空命令时
 * 对象什么都不做，其实，这也是一种设计模式，可以省掉对空的判断
 * @author
 * @date 2021-02-19 22:56
 */
public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
