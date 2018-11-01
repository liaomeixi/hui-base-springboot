package com.hui.base.springboot.model;

import java.io.Serializable;
import java.util.Date;

public class Words implements Serializable {
    private Long id;

    private Integer webid;

    private String content;

    private Long count;

    private Long todayCount;

    private Long hotday;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getWebid() {
        return webid;
    }

    public void setWebid(Integer webid) {
        this.webid = webid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Long getTodayCount() {
        return todayCount;
    }

    public void setTodayCount(Long todayCount) {
        this.todayCount = todayCount;
    }

    public Long getHotday() {
        return hotday;
    }

    public void setHotday(Long hotday) {
        this.hotday = hotday;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", webid=").append(webid);
        sb.append(", content=").append(content);
        sb.append(", count=").append(count);
        sb.append(", todayCount=").append(todayCount);
        sb.append(", hotday=").append(hotday);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}