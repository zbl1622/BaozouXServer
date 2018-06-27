package com.zbl.baozoudaily.xserver.main.user.response;


/**
 * Created by jiangyu on 2015/11/17.
 */
public class UserBean {

    private String access_token = "";
    private String avatar = "";
    private String name = "";
    private String user_id = "";

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}

