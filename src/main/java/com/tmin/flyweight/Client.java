package com.tmin.flyweight;

import com.tmin.facade.Facade;

/**
 * @author
 * @date 2021-02-09 0:11
 */
public class Client {
    public static void main(String[] args) {
        //创建一个工厂
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        //客户要一个以新闻方式发布的网站
        WebSite webSite1 = webSiteFactory.getWebSiteCategory("新闻");
        webSite1.use(new User("zs"));

        //客户要一个以博客方式发布的网站
        WebSite webSite2 = webSiteFactory.getWebSiteCategory("博客");
        webSite2.use(new User("ls"));

        //客户要一个以博客方式发布的网站
        WebSite webSite3 = webSiteFactory.getWebSiteCategory("博客");
        webSite3.use(new User("wangwu"));

        System.out.println(webSiteFactory.getWebSiteCount());

    }
}
