package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class UpgradeLog implements Serializable {
    private Integer tbulId;

    private String tbulTitle;

    private Byte tbulType;

    private String tbulVersion;

    private String tbulDescribe;

    private Date tbulOnTime;

    private Integer tbulAdder;

    private Date tbulUpdateTime;

    private Date tbulAddTime;

    private Byte tbulStatus;

    private static final long serialVersionUID = 1L;

    public Integer getTbulId() {
        return tbulId;
    }

    public void setTbulId(Integer tbulId) {
        this.tbulId = tbulId;
    }

    public String getTbulTitle() {
        return tbulTitle;
    }

    public void setTbulTitle(String tbulTitle) {
        this.tbulTitle = tbulTitle == null ? null : tbulTitle.trim();
    }

    public Byte getTbulType() {
        return tbulType;
    }

    public void setTbulType(Byte tbulType) {
        this.tbulType = tbulType;
    }

    public String getTbulVersion() {
        return tbulVersion;
    }

    public void setTbulVersion(String tbulVersion) {
        this.tbulVersion = tbulVersion == null ? null : tbulVersion.trim();
    }

    public String getTbulDescribe() {
        return tbulDescribe;
    }

    public void setTbulDescribe(String tbulDescribe) {
        this.tbulDescribe = tbulDescribe == null ? null : tbulDescribe.trim();
    }

    public Date getTbulOnTime() {
        return tbulOnTime;
    }

    public void setTbulOnTime(Date tbulOnTime) {
        this.tbulOnTime = tbulOnTime;
    }

    public Integer getTbulAdder() {
        return tbulAdder;
    }

    public void setTbulAdder(Integer tbulAdder) {
        this.tbulAdder = tbulAdder;
    }

    public Date getTbulUpdateTime() {
        return tbulUpdateTime;
    }

    public void setTbulUpdateTime(Date tbulUpdateTime) {
        this.tbulUpdateTime = tbulUpdateTime;
    }

    public Date getTbulAddTime() {
        return tbulAddTime;
    }

    public void setTbulAddTime(Date tbulAddTime) {
        this.tbulAddTime = tbulAddTime;
    }

    public Byte getTbulStatus() {
        return tbulStatus;
    }

    public void setTbulStatus(Byte tbulStatus) {
        this.tbulStatus = tbulStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbulId=").append(tbulId);
        sb.append(", tbulTitle=").append(tbulTitle);
        sb.append(", tbulType=").append(tbulType);
        sb.append(", tbulVersion=").append(tbulVersion);
        sb.append(", tbulDescribe=").append(tbulDescribe);
        sb.append(", tbulOnTime=").append(tbulOnTime);
        sb.append(", tbulAdder=").append(tbulAdder);
        sb.append(", tbulUpdateTime=").append(tbulUpdateTime);
        sb.append(", tbulAddTime=").append(tbulAddTime);
        sb.append(", tbulStatus=").append(tbulStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}