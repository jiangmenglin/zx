package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class ApiType implements Serializable {
    private Long satId;

    private String satName;

    private Long satParent;

    private String satFlag;

    private Date satUpdateTime;

    private Date satAddTime;

    private Short satStatus;

    private static final long serialVersionUID = 1L;

    public Long getSatId() {
        return satId;
    }

    public void setSatId(Long satId) {
        this.satId = satId;
    }

    public String getSatName() {
        return satName;
    }

    public void setSatName(String satName) {
        this.satName = satName == null ? null : satName.trim();
    }

    public Long getSatParent() {
        return satParent;
    }

    public void setSatParent(Long satParent) {
        this.satParent = satParent;
    }

    public String getSatFlag() {
        return satFlag;
    }

    public void setSatFlag(String satFlag) {
        this.satFlag = satFlag == null ? null : satFlag.trim();
    }

    public Date getSatUpdateTime() {
        return satUpdateTime;
    }

    public void setSatUpdateTime(Date satUpdateTime) {
        this.satUpdateTime = satUpdateTime;
    }

    public Date getSatAddTime() {
        return satAddTime;
    }

    public void setSatAddTime(Date satAddTime) {
        this.satAddTime = satAddTime;
    }

    public Short getSatStatus() {
        return satStatus;
    }

    public void setSatStatus(Short satStatus) {
        this.satStatus = satStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", satId=").append(satId);
        sb.append(", satName=").append(satName);
        sb.append(", satParent=").append(satParent);
        sb.append(", satFlag=").append(satFlag);
        sb.append(", satUpdateTime=").append(satUpdateTime);
        sb.append(", satAddTime=").append(satAddTime);
        sb.append(", satStatus=").append(satStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}