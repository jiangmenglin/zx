package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class UnitPartner implements Serializable {
    private Long tbupId;

    private String tbupName;

    private String tbupAddress;

    private Long tbupHost;

    private Byte tbupCooperateNature;

    private Long tbupParentId;

    private Date tbupUpdateTime;

    private Date tbupAddTime;

    private Short tbupStatus;

    private static final long serialVersionUID = 1L;

    public Long getTbupId() {
        return tbupId;
    }

    public void setTbupId(Long tbupId) {
        this.tbupId = tbupId;
    }

    public String getTbupName() {
        return tbupName;
    }

    public void setTbupName(String tbupName) {
        this.tbupName = tbupName == null ? null : tbupName.trim();
    }

    public String getTbupAddress() {
        return tbupAddress;
    }

    public void setTbupAddress(String tbupAddress) {
        this.tbupAddress = tbupAddress == null ? null : tbupAddress.trim();
    }

    public Long getTbupHost() {
        return tbupHost;
    }

    public void setTbupHost(Long tbupHost) {
        this.tbupHost = tbupHost;
    }

    public Byte getTbupCooperateNature() {
        return tbupCooperateNature;
    }

    public void setTbupCooperateNature(Byte tbupCooperateNature) {
        this.tbupCooperateNature = tbupCooperateNature;
    }

    public Long getTbupParentId() {
        return tbupParentId;
    }

    public void setTbupParentId(Long tbupParentId) {
        this.tbupParentId = tbupParentId;
    }

    public Date getTbupUpdateTime() {
        return tbupUpdateTime;
    }

    public void setTbupUpdateTime(Date tbupUpdateTime) {
        this.tbupUpdateTime = tbupUpdateTime;
    }

    public Date getTbupAddTime() {
        return tbupAddTime;
    }

    public void setTbupAddTime(Date tbupAddTime) {
        this.tbupAddTime = tbupAddTime;
    }

    public Short getTbupStatus() {
        return tbupStatus;
    }

    public void setTbupStatus(Short tbupStatus) {
        this.tbupStatus = tbupStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbupId=").append(tbupId);
        sb.append(", tbupName=").append(tbupName);
        sb.append(", tbupAddress=").append(tbupAddress);
        sb.append(", tbupHost=").append(tbupHost);
        sb.append(", tbupCooperateNature=").append(tbupCooperateNature);
        sb.append(", tbupParentId=").append(tbupParentId);
        sb.append(", tbupUpdateTime=").append(tbupUpdateTime);
        sb.append(", tbupAddTime=").append(tbupAddTime);
        sb.append(", tbupStatus=").append(tbupStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}