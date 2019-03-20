package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Provid implements Serializable {
    private Long tbpId;

    private Long tbpHost;

    private String tbpName;

    private String tbpPerson;

    private String tbpConcat;

    private String tbpFlag;

    private String tbpRemark;

    private Date tbpUpdateTime;

    private Date tbpAddTime;

    private Short tbpStatus;

    private static final long serialVersionUID = 1L;

    public Long getTbpId() {
        return tbpId;
    }

    public void setTbpId(Long tbpId) {
        this.tbpId = tbpId;
    }

    public Long getTbpHost() {
        return tbpHost;
    }

    public void setTbpHost(Long tbpHost) {
        this.tbpHost = tbpHost;
    }

    public String getTbpName() {
        return tbpName;
    }

    public void setTbpName(String tbpName) {
        this.tbpName = tbpName == null ? null : tbpName.trim();
    }

    public String getTbpPerson() {
        return tbpPerson;
    }

    public void setTbpPerson(String tbpPerson) {
        this.tbpPerson = tbpPerson == null ? null : tbpPerson.trim();
    }

    public String getTbpConcat() {
        return tbpConcat;
    }

    public void setTbpConcat(String tbpConcat) {
        this.tbpConcat = tbpConcat == null ? null : tbpConcat.trim();
    }

    public String getTbpFlag() {
        return tbpFlag;
    }

    public void setTbpFlag(String tbpFlag) {
        this.tbpFlag = tbpFlag == null ? null : tbpFlag.trim();
    }

    public String getTbpRemark() {
        return tbpRemark;
    }

    public void setTbpRemark(String tbpRemark) {
        this.tbpRemark = tbpRemark == null ? null : tbpRemark.trim();
    }

    public Date getTbpUpdateTime() {
        return tbpUpdateTime;
    }

    public void setTbpUpdateTime(Date tbpUpdateTime) {
        this.tbpUpdateTime = tbpUpdateTime;
    }

    public Date getTbpAddTime() {
        return tbpAddTime;
    }

    public void setTbpAddTime(Date tbpAddTime) {
        this.tbpAddTime = tbpAddTime;
    }

    public Short getTbpStatus() {
        return tbpStatus;
    }

    public void setTbpStatus(Short tbpStatus) {
        this.tbpStatus = tbpStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbpId=").append(tbpId);
        sb.append(", tbpHost=").append(tbpHost);
        sb.append(", tbpName=").append(tbpName);
        sb.append(", tbpPerson=").append(tbpPerson);
        sb.append(", tbpConcat=").append(tbpConcat);
        sb.append(", tbpFlag=").append(tbpFlag);
        sb.append(", tbpRemark=").append(tbpRemark);
        sb.append(", tbpUpdateTime=").append(tbpUpdateTime);
        sb.append(", tbpAddTime=").append(tbpAddTime);
        sb.append(", tbpStatus=").append(tbpStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}