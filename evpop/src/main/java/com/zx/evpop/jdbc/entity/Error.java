package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Error implements Serializable {
    private Long seId;

    private String seFlag;

    private Integer seCount;

    private Date seUpdateTime;

    private Date seAddTime;

    private Short seStatus;

    private String seTitle;

    private String seContent;

    private static final long serialVersionUID = 1L;

    public Long getSeId() {
        return seId;
    }

    public void setSeId(Long seId) {
        this.seId = seId;
    }

    public String getSeFlag() {
        return seFlag;
    }

    public void setSeFlag(String seFlag) {
        this.seFlag = seFlag == null ? null : seFlag.trim();
    }

    public Integer getSeCount() {
        return seCount;
    }

    public void setSeCount(Integer seCount) {
        this.seCount = seCount;
    }

    public Date getSeUpdateTime() {
        return seUpdateTime;
    }

    public void setSeUpdateTime(Date seUpdateTime) {
        this.seUpdateTime = seUpdateTime;
    }

    public Date getSeAddTime() {
        return seAddTime;
    }

    public void setSeAddTime(Date seAddTime) {
        this.seAddTime = seAddTime;
    }

    public Short getSeStatus() {
        return seStatus;
    }

    public void setSeStatus(Short seStatus) {
        this.seStatus = seStatus;
    }

    public String getSeTitle() {
        return seTitle;
    }

    public void setSeTitle(String seTitle) {
        this.seTitle = seTitle == null ? null : seTitle.trim();
    }

    public String getSeContent() {
        return seContent;
    }

    public void setSeContent(String seContent) {
        this.seContent = seContent == null ? null : seContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", seId=").append(seId);
        sb.append(", seFlag=").append(seFlag);
        sb.append(", seCount=").append(seCount);
        sb.append(", seUpdateTime=").append(seUpdateTime);
        sb.append(", seAddTime=").append(seAddTime);
        sb.append(", seStatus=").append(seStatus);
        sb.append(", seTitle=").append(seTitle);
        sb.append(", seContent=").append(seContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}