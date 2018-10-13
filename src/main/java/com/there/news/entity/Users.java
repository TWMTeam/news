package com.there.news.entity;

import java.io.Serializable;

public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    private String u_id;//用户ID
    private String u_name;//用户名
    private String u_password;//用户密码

    //另外加一些属性,比如:性别、邮箱等等..

    public String getU_id() {
        return u_id;
    }

    public void setU_id(String u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_password() {
        return u_password;
    }

    public void setU_password(String u_password) {
        this.u_password = u_password;
    }
}
