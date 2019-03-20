package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class WebHelp implements Serializable {
    private Long tbwhId;

    private String tbwhName;

    private Date tbwhAddTime;

    private Date tbwhUpdateTime;

    private Byte tbwhStatus;

    private String tbwhContent;

    private static final long serialVersionUID = 1L;

    public Long getTbwhId() {
        return tbwhId;
    }

    public void setTbwhId(Long tbwhId) {
        this.tbwhId = tbwhId;
    }

    public String getTbwhName() {
        return tbwhName;
    }

    public void setTbwhName(String tbwhName) {
        this.tbwhName = tbwhName == null ? null : tbwhName.trim();
    }

    public Date getTbwhAddTime() {
        return tbwhAddTime;
    }

    public void setTbwhAddTime(Date tbwhAddTime) {
        this.tbwhAddTime = tbwhAddTime;
    }

    public Date getTbwhUpdateTime() {
        return tbwhUpdateTime;
    }

    public void setTbwhUpdateTime(Date tbwhUpdateTime) {
        this.tbwhUpdateTime = tbwhUpdateTime;
    }

    public Byte getTbwhStatus() {
        return tbwhStatus;
    }

    public void setTbwhStatus(Byte tbwhStatus) {
        this.tbwhStatus = tbwhStatus;
    }

    public String getTbwhContent() {
        return tbwhContent;
    }

    public void setTbwhContent(String tbwhContent) {
        this.tbwhContent = tbwhContent == null ? null : tbwhContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbwhId=").append(tbwhId);
        sb.append(", tbwhName=").append(tbwhName);
        sb.append(", tbwhAddTime=").append(tbwhAddTime);
        sb.append(", tbwhUpdateTime=").append(tbwhUpdateTime);
        sb.append(", tbwhStatus=").append(tbwhStatus);
        sb.append(", tbwhContent=").append(tbwhContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}