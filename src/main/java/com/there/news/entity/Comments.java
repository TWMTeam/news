package com.there.news.entity;

import java.io.Serializable;

public class Comments implements Serializable {

    private static final long serialVersionUID = 1L;

    private String c_id;//评论ID
    private String c_nid;//评论对应的新闻ID
    private String c_content;//评论内容
    private String c_date;//评论时间
    private String c_ip;//评论人的IP
    private String c_author;//评论的人

    public String getC_id() {
        return c_id;
    }

    public void setC_id(String c_id) {
        this.c_id = c_id;
    }

    public String getC_nid() {
        return c_nid;
    }

    public void setC_nid(String c_nid) {
        this.c_nid = c_nid;
    }

    public String getC_content() {
        return c_content;
    }

    public void setC_content(String c_content) {
        this.c_content = c_content;
    }

    public String getC_date() {
        return c_date;
    }

    public void setC_date(String c_date) {
        this.c_date = c_date;
    }

    public String getC_ip() {
        return c_ip;
    }

    public void setC_ip(String c_ip) {
        this.c_ip = c_ip;
    }

    public String getC_author() {
        return c_author;
    }

    public void setC_author(String c_author) {
        this.c_author = c_author;
    }
}
