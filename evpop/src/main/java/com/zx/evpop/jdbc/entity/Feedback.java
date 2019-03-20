package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Feedback implements Serializable {
    private Long tbtfId;

    private String tbtfTitle;

    private Short tbtfType;

    private String tbtfContent;

    private String tbtfRemark;

    private Long tbtfAdder;

    private Date tbtfUpdateTime;

    private Date tbtfAddTime;

    private Short tbtfStatus;

    private String tbtfLog;

    private static final long serialVersionUID = 1L;

    public Long getTbtfId() {
        return tbtfId;
    }

    public void setTbtfId(Long tbtfId) {
        this.tbtfId = tbtfId;
    }

    public String getTbtfTitle() {
        return tbtfTitle;
    }

    public void setTbtfTitle(String tbtfTitle) {
        this.tbtfTitle = tbtfTitle == null ? null : tbtfTitle.trim();
    }

    public Short getTbtfType() {
        return tbtfType;
    }

    public void setTbtfType(Short tbtfType) {
        this.tbtfType = tbtfType;
    }

    public String getTbtfContent() {
        return tbtfContent;
    }

    public void setTbtfContent(String tbtfContent) {
        this.tbtfContent = tbtfContent == null ? null : tbtfContent.trim();
    }

    public String getTbtfRemark() {
        return tbtfRemark;
    }

    public void setTbtfRemark(String tbtfRemark) {
        this.tbtfRemark = tbtfRemark == null ? null : tbtfRemark.trim();
    }

    public Long getTbtfAdder() {
        return tbtfAdder;
    }

    public void setTbtfAdder(Long tbtfAdder) {
        this.tbtfAdder = tbtfAdder;
    }

    public Date getTbtfUpdateTime() {
        return tbtfUpdateTime;
    }

    public void setTbtfUpdateTime(Date tbtfUpdateTime) {
        this.tbtfUpdateTime = tbtfUpdateTime;
    }

    public Date getTbtfAddTime() {
        return tbtfAddTime;
    }

    public void setTbtfAddTime(Date tbtfAddTime) {
        this.tbtfAddTime = tbtfAddTime;
    }

    public Short getTbtfStatus() {
        return tbtfStatus;
    }

    public void setTbtfStatus(Short tbtfStatus) {
        this.tbtfStatus = tbtfStatus;
    }

    public String getTbtfLog() {
        return tbtfLog;
    }

    public void setTbtfLog(String tbtfLog) {
        this.tbtfLog = tbtfLog == null ? null : tbtfLog.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbtfId=").append(tbtfId);
        sb.append(", tbtfTitle=").append(tbtfTitle);
        sb.append(", tbtfType=").append(tbtfType);
        sb.append(", tbtfContent=").append(tbtfContent);
        sb.append(", tbtfRemark=").append(tbtfRemark);
        sb.append(", tbtfAdder=").append(tbtfAdder);
        sb.append(", tbtfUpdateTime=").append(tbtfUpdateTime);
        sb.append(", tbtfAddTime=").append(tbtfAddTime);
        sb.append(", tbtfStatus=").append(tbtfStatus);
        sb.append(", tbtfLog=").append(tbtfLog);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}