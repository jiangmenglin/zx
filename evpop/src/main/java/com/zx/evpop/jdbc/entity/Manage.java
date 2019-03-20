package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Manage implements Serializable {
    private Integer tbmId;

    private Integer tbmHost;

    private String tbmName;

    private String tbmMobile;

    private String tbmPassword;

    private Byte tbmType;

    private String tbmAreas;

    private Date tbmUpdateTime;

    private Date tbmAddTime;

    private Byte tbmState;

    private Byte tbmStatus;

    private static final long serialVersionUID = 1L;

    public Integer getTbmId() {
        return tbmId;
    }

    public void setTbmId(Integer tbmId) {
        this.tbmId = tbmId;
    }

    public Integer getTbmHost() {
        return tbmHost;
    }

    public void setTbmHost(Integer tbmHost) {
        this.tbmHost = tbmHost;
    }

    public String getTbmName() {
        return tbmName;
    }

    public void setTbmName(String tbmName) {
        this.tbmName = tbmName == null ? null : tbmName.trim();
    }

    public String getTbmMobile() {
        return tbmMobile;
    }

    public void setTbmMobile(String tbmMobile) {
        this.tbmMobile = tbmMobile == null ? null : tbmMobile.trim();
    }

    public String getTbmPassword() {
        return tbmPassword;
    }

    public void setTbmPassword(String tbmPassword) {
        this.tbmPassword = tbmPassword == null ? null : tbmPassword.trim();
    }

    public Byte getTbmType() {
        return tbmType;
    }

    public void setTbmType(Byte tbmType) {
        this.tbmType = tbmType;
    }

    public String getTbmAreas() {
        return tbmAreas;
    }

    public void setTbmAreas(String tbmAreas) {
        this.tbmAreas = tbmAreas == null ? null : tbmAreas.trim();
    }

    public Date getTbmUpdateTime() {
        return tbmUpdateTime;
    }

    public void setTbmUpdateTime(Date tbmUpdateTime) {
        this.tbmUpdateTime = tbmUpdateTime;
    }

    public Date getTbmAddTime() {
        return tbmAddTime;
    }

    public void setTbmAddTime(Date tbmAddTime) {
        this.tbmAddTime = tbmAddTime;
    }

    public Byte getTbmState() {
        return tbmState;
    }

    public void setTbmState(Byte tbmState) {
        this.tbmState = tbmState;
    }

    public Byte getTbmStatus() {
        return tbmStatus;
    }

    public void setTbmStatus(Byte tbmStatus) {
        this.tbmStatus = tbmStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbmId=").append(tbmId);
        sb.append(", tbmHost=").append(tbmHost);
        sb.append(", tbmName=").append(tbmName);
        sb.append(", tbmMobile=").append(tbmMobile);
        sb.append(", tbmPassword=").append(tbmPassword);
        sb.append(", tbmType=").append(tbmType);
        sb.append(", tbmAreas=").append(tbmAreas);
        sb.append(", tbmUpdateTime=").append(tbmUpdateTime);
        sb.append(", tbmAddTime=").append(tbmAddTime);
        sb.append(", tbmState=").append(tbmState);
        sb.append(", tbmStatus=").append(tbmStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}