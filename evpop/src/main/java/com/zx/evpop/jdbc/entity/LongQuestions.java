package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class LongQuestions implements Serializable {
    private Long tblqId;

    private String tblqName;

    private Long tblqLevel;

    private Date tblqAddTime;

    private Date tblqUpdateTime;

    private Short tblqStatus;

    private String tblqContent;

    private static final long serialVersionUID = 1L;

    public Long getTblqId() {
        return tblqId;
    }

    public void setTblqId(Long tblqId) {
        this.tblqId = tblqId;
    }

    public String getTblqName() {
        return tblqName;
    }

    public void setTblqName(String tblqName) {
        this.tblqName = tblqName == null ? null : tblqName.trim();
    }

    public Long getTblqLevel() {
        return tblqLevel;
    }

    public void setTblqLevel(Long tblqLevel) {
        this.tblqLevel = tblqLevel;
    }

    public Date getTblqAddTime() {
        return tblqAddTime;
    }

    public void setTblqAddTime(Date tblqAddTime) {
        this.tblqAddTime = tblqAddTime;
    }

    public Date getTblqUpdateTime() {
        return tblqUpdateTime;
    }

    public void setTblqUpdateTime(Date tblqUpdateTime) {
        this.tblqUpdateTime = tblqUpdateTime;
    }

    public Short getTblqStatus() {
        return tblqStatus;
    }

    public void setTblqStatus(Short tblqStatus) {
        this.tblqStatus = tblqStatus;
    }

    public String getTblqContent() {
        return tblqContent;
    }

    public void setTblqContent(String tblqContent) {
        this.tblqContent = tblqContent == null ? null : tblqContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tblqId=").append(tblqId);
        sb.append(", tblqName=").append(tblqName);
        sb.append(", tblqLevel=").append(tblqLevel);
        sb.append(", tblqAddTime=").append(tblqAddTime);
        sb.append(", tblqUpdateTime=").append(tblqUpdateTime);
        sb.append(", tblqStatus=").append(tblqStatus);
        sb.append(", tblqContent=").append(tblqContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}