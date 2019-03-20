package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Remote implements Serializable {
    private Long tbrId;

    private Short tbrHost;

    private Integer tbrCar;

    private Short tbrType;

    private String tbrEditor;

    private String tbrRemark;

    private Date tbrUpdateTime;

    private Date tbrAddTime;

    private Date tbrRetTime;

    private String tbrMessage;

    private String tbrCode;

    private String tbrResult;

    private Byte tbrStatus;

    private Date createtime;

    private Date modifydate;

    private static final long serialVersionUID = 1L;

    public Long getTbrId() {
        return tbrId;
    }

    public void setTbrId(Long tbrId) {
        this.tbrId = tbrId;
    }

    public Short getTbrHost() {
        return tbrHost;
    }

    public void setTbrHost(Short tbrHost) {
        this.tbrHost = tbrHost;
    }

    public Integer getTbrCar() {
        return tbrCar;
    }

    public void setTbrCar(Integer tbrCar) {
        this.tbrCar = tbrCar;
    }

    public Short getTbrType() {
        return tbrType;
    }

    public void setTbrType(Short tbrType) {
        this.tbrType = tbrType;
    }

    public String getTbrEditor() {
        return tbrEditor;
    }

    public void setTbrEditor(String tbrEditor) {
        this.tbrEditor = tbrEditor == null ? null : tbrEditor.trim();
    }

    public String getTbrRemark() {
        return tbrRemark;
    }

    public void setTbrRemark(String tbrRemark) {
        this.tbrRemark = tbrRemark == null ? null : tbrRemark.trim();
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

    public Date getTbrRetTime() {
        return tbrRetTime;
    }

    public void setTbrRetTime(Date tbrRetTime) {
        this.tbrRetTime = tbrRetTime;
    }

    public String getTbrMessage() {
        return tbrMessage;
    }

    public void setTbrMessage(String tbrMessage) {
        this.tbrMessage = tbrMessage == null ? null : tbrMessage.trim();
    }

    public String getTbrCode() {
        return tbrCode;
    }

    public void setTbrCode(String tbrCode) {
        this.tbrCode = tbrCode == null ? null : tbrCode.trim();
    }

    public String getTbrResult() {
        return tbrResult;
    }

    public void setTbrResult(String tbrResult) {
        this.tbrResult = tbrResult == null ? null : tbrResult.trim();
    }

    public Byte getTbrStatus() {
        return tbrStatus;
    }

    public void setTbrStatus(Byte tbrStatus) {
        this.tbrStatus = tbrStatus;
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
        sb.append(", tbrId=").append(tbrId);
        sb.append(", tbrHost=").append(tbrHost);
        sb.append(", tbrCar=").append(tbrCar);
        sb.append(", tbrType=").append(tbrType);
        sb.append(", tbrEditor=").append(tbrEditor);
        sb.append(", tbrRemark=").append(tbrRemark);
        sb.append(", tbrUpdateTime=").append(tbrUpdateTime);
        sb.append(", tbrAddTime=").append(tbrAddTime);
        sb.append(", tbrRetTime=").append(tbrRetTime);
        sb.append(", tbrMessage=").append(tbrMessage);
        sb.append(", tbrCode=").append(tbrCode);
        sb.append(", tbrResult=").append(tbrResult);
        sb.append(", tbrStatus=").append(tbrStatus);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}