package com.tmin.flyweight;

/**
 * 具体网站
 * @author
 * @date 2021-02-09 0:04
 */
public class ConcreteWebSite extends WebSite {
    //网站发布的类型
    private String type = "";


    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为：" + type+"在使用中... 使用者："+user.getName());
    }
}
