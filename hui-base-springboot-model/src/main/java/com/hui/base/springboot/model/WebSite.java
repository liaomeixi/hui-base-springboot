package com.hui.base.springboot.model;

import java.io.Serializable;

public class WebSite implements Serializable {
    private Integer id;

    private Integer webid;

    private String connectionUrl;

    private String name;

    private String tagKey;

    private String tagValue;

    private String selective;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWebid() {
        return webid;
    }

    public void setWebid(Integer webid) {
        this.webid = webid;
    }

    public String getConnectionUrl() {
        return connectionUrl;
    }

    public void setConnectionUrl(String connectionUrl) {
        this.connectionUrl = connectionUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTagKey() {
        return tagKey;
    }

    public void setTagKey(String tagKey) {
        this.tagKey = tagKey;
    }

    public String getTagValue() {
        return tagValue;
    }

    public void setTagValue(String tagValue) {
        this.tagValue = tagValue;
    }

    public String getSelective() {
        return selective;
    }

    public void setSelective(String selective) {
        this.selective = selective;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", webid=").append(webid);
        sb.append(", connectionUrl=").append(connectionUrl);
        sb.append(", name=").append(name);
        sb.append(", tagKey=").append(tagKey);
        sb.append(", tagValue=").append(tagValue);
        sb.append(", selective=").append(selective);
        sb.append("]");
        return sb.toString();
    }
}