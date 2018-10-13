package com.there.news.entity;

import java.io.Serializable;

public class Topic implements Serializable {

    private static final long serialVersionUID = 1L;

    private String t_id;//主题ID
    private String t_name;//主题名称

    public String getT_id() {
        return t_id;
    }

    public void setT_id(String t_id) {
        this.t_id = t_id;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }
}
