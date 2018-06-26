package com.zbl.baozoudaily.xserver.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value = "/**/user/login", method = RequestMethod.POST)
    private UserBean getHelloPage() {
        UserBean userBean = new UserBean();
        userBean.setName("zbl");
        userBean.setUser_id("12321");
        userBean.setAccess_token("asdfqwer");
        userBean.setAvatar("https://www.qqtouxiang.com/d/file/jiemei/2017-01-04/6064093faff73b9378aa83527d64ebbc.jpg");
        return userBean;
    }

}
