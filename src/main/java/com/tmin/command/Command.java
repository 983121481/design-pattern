package com.tmin.command;

/**
 * 创建命令接口
 * @author
 * @date 2021-02-19 21:48
 */
public interface Command {

    //执行某个命令
    void execute();

    //撤销命令
    void undo();

}
