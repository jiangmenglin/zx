package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Restriction implements Serializable {
    private Long tbrId;

    private Long tbrHost;

    private String tbrName;

    private String tbrCarType;

    private String tbrRestTimeStart;

    private String tbrRestTimeEnd;

    private Date tbrDurationStart;

    private Date tbrDurationEnd;

    private String tbrAreaText;

    private String tbrRules;

    private Date tbrUpdateTime;

    private Date tbrAddTime;

    private Short tbrStatus;

    private static final long serialVersionUID = 1L;

    public Long getTbrId() {
        return tbrId;
    }

    public void setTbrId(Long tbrId) {
        this.tbrId = tbrId;
    }

    public Long getTbrHost() {
        return tbrHost;
    }

    public void setTbrHost(Long tbrHost) {
        this.tbrHost = tbrHost;
    }

    public String getTbrName() {
        return tbrName;
    }

    public void setTbrName(String tbrName) {
        this.tbrName = tbrName == null ? null : tbrName.trim();
    }

    public String getTbrCarType() {
        return tbrCarType;
    }

    public void setTbrCarType(String tbrCarType) {
        this.tbrCarType = tbrCarType == null ? null : tbrCarType.trim();
    }

    public String getTbrRestTimeStart() {
        return tbrRestTimeStart;
    }

    public void setTbrRestTimeStart(String tbrRestTimeStart) {
        this.tbrRestTimeStart = tbrRestTimeStart == null ? null : tbrRestTimeStart.trim();
    }

    public String getTbrRestTimeEnd() {
        return tbrRestTimeEnd;
    }

    public void setTbrRestTimeEnd(String tbrRestTimeEnd) {
        this.tbrRestTimeEnd = tbrRestTimeEnd == null ? null : tbrRestTimeEnd.trim();
    }

    public Date getTbrDurationStart() {
        return tbrDurationStart;
    }

    public void setTbrDurationStart(Date tbrDurationStart) {
        this.tbrDurationStart = tbrDurationStart;
    }

    public Date getTbrDurationEnd() {
        return tbrDurationEnd;
    }

    public void setTbrDurationEnd(Date tbrDurationEnd) {
        this.tbrDurationEnd = tbrDurationEnd;
    }

    public String getTbrAreaText() {
        return tbrAreaText;
    }

    public void setTbrAreaText(String tbrAreaText) {
        this.tbrAreaText = tbrAreaText == null ? null : tbrAreaText.trim();
    }

    public String getTbrRules() {
        return tbrRules;
    }

    public void setTbrRules(String tbrRules) {
        this.tbrRules = tbrRules == null ? null : tbrRules.trim();
    }

    public Date getTbrUpdateTime() {
        return tbrUpdateTime;
    }

    public void setTbrUpdateTime(Date tbrUpdateTime) {
        this.tbrUpdateTime = tbrUpdateTime;
    }

    public Date getTbrAddTime() {
        return tbrAddTime;
    }

    public void setTbrAddTime(Date tbrAddTime) {
        this.tbrAddTime = tbrAddTime;
    }

    public Short getTbrStatus() {
        return tbrStatus;
    }

    public void setTbrStatus(Short tbrStatus) {
        this.tbrStatus = tbrStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbrId=").append(tbrId);
        sb.append(", tbrHost=").append(tbrHost);
        sb.append(", tbrName=").append(tbrName);
        sb.append(", tbrCarType=").append(tbrCarType);
        sb.append(", tbrRestTimeStart=").append(tbrRestTimeStart);
        sb.append(", tbrRestTimeEnd=").append(tbrRestTimeEnd);
        sb.append(", tbrDurationStart=").append(tbrDurationStart);
        sb.append(", tbrDurationEnd=").append(tbrDurationEnd);
        sb.append(", tbrAreaText=").append(tbrAreaText);
        sb.append(", tbrRules=").append(tbrRules);
        sb.append(", tbrUpdateTime=").append(tbrUpdateTime);
        sb.append(", tbrAddTime=").append(tbrAddTime);
        sb.append(", tbrStatus=").append(tbrStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}