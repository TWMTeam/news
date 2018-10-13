package com.there.news.entity;

import java.io.Serializable;
import java.util.List;

public class News implements Serializable {

    private static final long serialVersionUID = 1L;

    private String n_id;//新闻序号
    private String n_t_id;//新闻主题ID
    private String n_tname;//新闻主题名称
    private List<Comments> comments;
    private String n_title;//新闻标题
    private String n_author;//新闻作者
    private String n_createdate;//新闻创建时间
    private String n_picpath;//标题图片
    private String n_content;//新闻内容
    private String n_modifydate;//新闻修改时间
    private String n_summary;//新闻摘要

    public String getN_id() {
        return n_id;
    }

    public void setN_id(String n_id) {
        this.n_id = n_id;
    }

    public String getN_t_id() {
        return n_t_id;
    }

    public void setN_t_id(String n_t_id) {
        this.n_t_id = n_t_id;
    }

    public String getN_tname() {
        return n_tname;
    }

    public void setN_tname(String n_tname) {
        this.n_tname = n_tname;
    }

    public List<Comments> getComments() {
        return comments;
    }

    public void setComments(List<Comments> comments) {
        this.comments = comments;
    }

    public String getN_title() {
        return n_title;
    }

    public void setN_title(String n_title) {
        this.n_title = n_title;
    }

    public String getN_author() {
        return n_author;
    }

    public void setN_author(String n_author) {
        this.n_author = n_author;
    }

    public String getN_createdate() {
        return n_createdate;
    }

    public void setN_createdate(String n_createdate) {
        this.n_createdate = n_createdate;
    }

    public String getN_picpath() {
        return n_picpath;
    }

    public void setN_picpath(String n_picpath) {
        this.n_picpath = n_picpath;
    }

    public String getN_content() {
        return n_content;
    }

    public void setN_content(String n_content) {
        this.n_content = n_content;
    }

    public String getN_modifydate() {
        return n_modifydate;
    }

    public void setN_modifydate(String n_modifydate) {
        this.n_modifydate = n_modifydate;
    }

    public String getN_summary() {
        return n_summary;
    }

    public void setN_summary(String n_summary) {
        this.n_summary = n_summary;
    }
}
