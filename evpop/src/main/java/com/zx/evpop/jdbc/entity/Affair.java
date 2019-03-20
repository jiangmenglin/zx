package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Affair implements Serializable {
    private Integer tbaId;

    private String tbaName;

    private String tbaFlag;

    private String tbaModel;

    private String tbaField;

    private String tbaProfile;

    private Date tbaUpdateTime;

    private Date tbaAddTime;

    private Byte tbaStatus;

    private Date createtime;

    private Date modifydate;

    private static final long serialVersionUID = 1L;

    public Integer getTbaId() {
        return tbaId;
    }

    public void setTbaId(Integer tbaId) {
        this.tbaId = tbaId;
    }

    public String getTbaName() {
        return tbaName;
    }

    public void setTbaName(String tbaName) {
        this.tbaName = tbaName == null ? null : tbaName.trim();
    }

    public String getTbaFlag() {
        return tbaFlag;
    }

    public void setTbaFlag(String tbaFlag) {
        this.tbaFlag = tbaFlag == null ? null : tbaFlag.trim();
    }

    public String getTbaModel() {
        return tbaModel;
    }

    public void setTbaModel(String tbaModel) {
        this.tbaModel = tbaModel == null ? null : tbaModel.trim();
    }

    public String getTbaField() {
        return tbaField;
    }

    public void setTbaField(String tbaField) {
        this.tbaField = tbaField == null ? null : tbaField.trim();
    }

    public String getTbaProfile() {
        return tbaProfile;
    }

    public void setTbaProfile(String tbaProfile) {
        this.tbaProfile = tbaProfile == null ? null : tbaProfile.trim();
    }

    public Date getTbaUpdateTime() {
        return tbaUpdateTime;
    }

    public void setTbaUpdateTime(Date tbaUpdateTime) {
        this.tbaUpdateTime = tbaUpdateTime;
    }

    public Date getTbaAddTime() {
        return tbaAddTime;
    }

    public void setTbaAddTime(Date tbaAddTime) {
        this.tbaAddTime = tbaAddTime;
    }

    public Byte getTbaStatus() {
        return tbaStatus;
    }

    public void setTbaStatus(Byte tbaStatus) {
        this.tbaStatus = tbaStatus;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbaId=").append(tbaId);
        sb.append(", tbaName=").append(tbaName);
        sb.append(", tbaFlag=").append(tbaFlag);
        sb.append(", tbaModel=").append(tbaModel);
        sb.append(", tbaField=").append(tbaField);
        sb.append(", tbaProfile=").append(tbaProfile);
        sb.append(", tbaUpdateTime=").append(tbaUpdateTime);
        sb.append(", tbaAddTime=").append(tbaAddTime);
        sb.append(", tbaStatus=").append(tbaStatus);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}