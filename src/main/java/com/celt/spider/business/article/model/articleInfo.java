package com.celt.spider.business.article.model;

import java.util.Date;

public class articleInfo {
    private Integer id;

    private String md5Url;

    private Date createTime;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMd5Url() {
        return md5Url;
    }

    public void setMd5Url(String md5Url) {
        this.md5Url = md5Url == null ? null : md5Url.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}