package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Recharge implements Serializable {
    private Long tbrId;

    private String tbrName;

    private Byte tbrFlg;

    private String tbrContent;

    private String tbrList;

    private Double tbrRatio;

    private Long tbrUpdateUser;

    private Date tbrUpdateTime;

    private Long tbrAddUser;

    private Date tbrAddTime;

    private Short tbrStatus;

    private static final long serialVersionUID = 1L;

    public Long getTbrId() {
        return tbrId;
    }

    public void setTbrId(Long tbrId) {
        this.tbrId = tbrId;
    }

    public String getTbrName() {
        return tbrName;
    }

    public void setTbrName(String tbrName) {
        this.tbrName = tbrName == null ? null : tbrName.trim();
    }

    public Byte getTbrFlg() {
        return tbrFlg;
    }

    public void setTbrFlg(Byte tbrFlg) {
        this.tbrFlg = tbrFlg;
    }

    public String getTbrContent() {
        return tbrContent;
    }

    public void setTbrContent(String tbrContent) {
        this.tbrContent = tbrContent == null ? null : tbrContent.trim();
    }

    public String getTbrList() {
        return tbrList;
    }

    public void setTbrList(String tbrList) {
        this.tbrList = tbrList == null ? null : tbrList.trim();
    }

    public Double getTbrRatio() {
        return tbrRatio;
    }

    public void setTbrRatio(Double tbrRatio) {
        this.tbrRatio = tbrRatio;
    }

    public Long getTbrUpdateUser() {
        return tbrUpdateUser;
    }

    public void setTbrUpdateUser(Long tbrUpdateUser) {
        this.tbrUpdateUser = tbrUpdateUser;
    }

    public Date getTbrUpdateTime() {
        return tbrUpdateTime;
    }

    public void setTbrUpdateTime(Date tbrUpdateTime) {
        this.tbrUpdateTime = tbrUpdateTime;
    }

    public Long getTbrAddUser() {
        return tbrAddUser;
    }

    public void setTbrAddUser(Long tbrAddUser) {
        this.tbrAddUser = tbrAddUser;
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
        sb.append(", tbrName=").append(tbrName);
        sb.append(", tbrFlg=").append(tbrFlg);
        sb.append(", tbrContent=").append(tbrContent);
        sb.append(", tbrList=").append(tbrList);
        sb.append(", tbrRatio=").append(tbrRatio);
        sb.append(", tbrUpdateUser=").append(tbrUpdateUser);
        sb.append(", tbrUpdateTime=").append(tbrUpdateTime);
        sb.append(", tbrAddUser=").append(tbrAddUser);
        sb.append(", tbrAddTime=").append(tbrAddTime);
        sb.append(", tbrStatus=").append(tbrStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}