package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class EventType implements Serializable {
    private Integer tbetId;

    private String tbetName;

    private String tbetFlag;

    private Short tbetType;

    private Short tbetSupport;

    private String tbetModel;

    private String tbetProfile;

    private Date tbetUpdateTime;

    private Date tbetAddTime;

    private Byte tbetStatus;

    private static final long serialVersionUID = 1L;

    public Integer getTbetId() {
        return tbetId;
    }

    public void setTbetId(Integer tbetId) {
        this.tbetId = tbetId;
    }

    public String getTbetName() {
        return tbetName;
    }

    public void setTbetName(String tbetName) {
        this.tbetName = tbetName == null ? null : tbetName.trim();
    }

    public String getTbetFlag() {
        return tbetFlag;
    }

    public void setTbetFlag(String tbetFlag) {
        this.tbetFlag = tbetFlag == null ? null : tbetFlag.trim();
    }

    public Short getTbetType() {
        return tbetType;
    }

    public void setTbetType(Short tbetType) {
        this.tbetType = tbetType;
    }

    public Short getTbetSupport() {
        return tbetSupport;
    }

    public void setTbetSupport(Short tbetSupport) {
        this.tbetSupport = tbetSupport;
    }

    public String getTbetModel() {
        return tbetModel;
    }

    public void setTbetModel(String tbetModel) {
        this.tbetModel = tbetModel == null ? null : tbetModel.trim();
    }

    public String getTbetProfile() {
        return tbetProfile;
    }

    public void setTbetProfile(String tbetProfile) {
        this.tbetProfile = tbetProfile == null ? null : tbetProfile.trim();
    }

    public Date getTbetUpdateTime() {
        return tbetUpdateTime;
    }

    public void setTbetUpdateTime(Date tbetUpdateTime) {
        this.tbetUpdateTime = tbetUpdateTime;
    }

    public Date getTbetAddTime() {
        return tbetAddTime;
    }

    public void setTbetAddTime(Date tbetAddTime) {
        this.tbetAddTime = tbetAddTime;
    }

    public Byte getTbetStatus() {
        return tbetStatus;
    }

    public void setTbetStatus(Byte tbetStatus) {
        this.tbetStatus = tbetStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbetId=").append(tbetId);
        sb.append(", tbetName=").append(tbetName);
        sb.append(", tbetFlag=").append(tbetFlag);
        sb.append(", tbetType=").append(tbetType);
        sb.append(", tbetSupport=").append(tbetSupport);
        sb.append(", tbetModel=").append(tbetModel);
        sb.append(", tbetProfile=").append(tbetProfile);
        sb.append(", tbetUpdateTime=").append(tbetUpdateTime);
        sb.append(", tbetAddTime=").append(tbetAddTime);
        sb.append(", tbetStatus=").append(tbetStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}