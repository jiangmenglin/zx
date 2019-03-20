package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class ViolatQuery implements Serializable {
    private Long tbvqId;

    private Long tbvqUser;

    private Short tbvqCount;

    private Short tbvqSecond;

    private Date tbvqUpdateTime;

    private Date tbvqAddTime;

    private Short tbvqStatus;

    private String tbvqData;

    private static final long serialVersionUID = 1L;

    public Long getTbvqId() {
        return tbvqId;
    }

    public void setTbvqId(Long tbvqId) {
        this.tbvqId = tbvqId;
    }

    public Long getTbvqUser() {
        return tbvqUser;
    }

    public void setTbvqUser(Long tbvqUser) {
        this.tbvqUser = tbvqUser;
    }

    public Short getTbvqCount() {
        return tbvqCount;
    }

    public void setTbvqCount(Short tbvqCount) {
        this.tbvqCount = tbvqCount;
    }

    public Short getTbvqSecond() {
        return tbvqSecond;
    }

    public void setTbvqSecond(Short tbvqSecond) {
        this.tbvqSecond = tbvqSecond;
    }

    public Date getTbvqUpdateTime() {
        return tbvqUpdateTime;
    }

    public void setTbvqUpdateTime(Date tbvqUpdateTime) {
        this.tbvqUpdateTime = tbvqUpdateTime;
    }

    public Date getTbvqAddTime() {
        return tbvqAddTime;
    }

    public void setTbvqAddTime(Date tbvqAddTime) {
        this.tbvqAddTime = tbvqAddTime;
    }

    public Short getTbvqStatus() {
        return tbvqStatus;
    }

    public void setTbvqStatus(Short tbvqStatus) {
        this.tbvqStatus = tbvqStatus;
    }

    public String getTbvqData() {
        return tbvqData;
    }

    public void setTbvqData(String tbvqData) {
        this.tbvqData = tbvqData == null ? null : tbvqData.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbvqId=").append(tbvqId);
        sb.append(", tbvqUser=").append(tbvqUser);
        sb.append(", tbvqCount=").append(tbvqCount);
        sb.append(", tbvqSecond=").append(tbvqSecond);
        sb.append(", tbvqUpdateTime=").append(tbvqUpdateTime);
        sb.append(", tbvqAddTime=").append(tbvqAddTime);
        sb.append(", tbvqStatus=").append(tbvqStatus);
        sb.append(", tbvqData=").append(tbvqData);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}