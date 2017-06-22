package com.celt.spider.business.article.model;

import java.util.Date;

public class article {
    private Integer id;

    private String md5Url;

    private String title;

    private String url;

    private String originUrl;

    private String originName;

    private String abstracts;

    private String keywords;

    private Date createTime;

    private Date changeTime;

    private String type;

    private String group;

    private String status;

    private Date statusChangetime;

    private String pageUrls;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getOriginUrl() {
        return originUrl;
    }

    public void setOriginUrl(String originUrl) {
        this.originUrl = originUrl == null ? null : originUrl.trim();
    }

    public String getOriginName() {
        return originName;
    }

    public void setOriginName(String originName) {
        this.originName = originName == null ? null : originName.trim();
    }

    public String getAbstracts() {
        return abstracts;
    }

    public void setAbstracts(String abstracts) {
        this.abstracts = abstracts == null ? null : abstracts.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group == null ? null : group.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getStatusChangetime() {
        return statusChangetime;
    }

    public void setStatusChangetime(Date statusChangetime) {
        this.statusChangetime = statusChangetime;
    }

    public String getPageUrls() {
        return pageUrls;
    }

    public void setPageUrls(String pageUrls) {
        this.pageUrls = pageUrls == null ? null : pageUrls.trim();
    }
}