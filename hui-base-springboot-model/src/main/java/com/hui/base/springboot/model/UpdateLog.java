package com.hui.base.springboot.model;

import java.io.Serializable;
import java.util.Date;

public class UpdateLog implements Serializable {
    private Long id;

    private Date updateTime;

    private Long wordAdd;

    private Long titleAdd;

    private String needtime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getWordAdd() {
        return wordAdd;
    }

    public void setWordAdd(Long wordAdd) {
        this.wordAdd = wordAdd;
    }

    public Long getTitleAdd() {
        return titleAdd;
    }

    public void setTitleAdd(Long titleAdd) {
        this.titleAdd = titleAdd;
    }

    public String getNeedtime() {
        return needtime;
    }

    public void setNeedtime(String needtime) {
        this.needtime = needtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", wordAdd=").append(wordAdd);
        sb.append(", titleAdd=").append(titleAdd);
        sb.append(", needtime=").append(needtime);
        sb.append("]");
        return sb.toString();
    }
}