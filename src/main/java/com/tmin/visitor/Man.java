package com.tmin.visitor;

/**
 * @author
 * @date 2021-02-20 0:19
 *
 * 这里使用了双分派，首先在客户端程序中，将具体状态作为参数传递Man中(第一次分派)
 * 然后Man类调用作为参数的"具体方法"中方法getWomanResult，同时将自己(this)作为
 * 参数传入，完成第二次分派
 */

public class Man extends Person {
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
