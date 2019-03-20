package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class UnitPerson implements Serializable {
    private Integer tbupId;

    private Short tbupHost;

    private Integer tbupInfo;

    private Long tbupGroup;

    private Integer tbupMember;

    private BigDecimal tbupQuota;

    private Date tbupUpdateTime;

    private Date tbupAddTime;

    private Byte tbupStatus;

    private static final long serialVersionUID = 1L;

    public Integer getTbupId() {
        return tbupId;
    }

    public void setTbupId(Integer tbupId) {
        this.tbupId = tbupId;
    }

    public Short getTbupHost() {
        return tbupHost;
    }

    public void setTbupHost(Short tbupHost) {
        this.tbupHost = tbupHost;
    }

    public Integer getTbupInfo() {
        return tbupInfo;
    }

    public void setTbupInfo(Integer tbupInfo) {
        this.tbupInfo = tbupInfo;
    }

    public Long getTbupGroup() {
        return tbupGroup;
    }

    public void setTbupGroup(Long tbupGroup) {
        this.tbupGroup = tbupGroup;
    }

    public Integer getTbupMember() {
        return tbupMember;
    }

    public void setTbupMember(Integer tbupMember) {
        this.tbupMember = tbupMember;
    }

    public BigDecimal getTbupQuota() {
        return tbupQuota;
    }

    public void setTbupQuota(BigDecimal tbupQuota) {
        this.tbupQuota = tbupQuota;
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

    public Byte getTbupStatus() {
        return tbupStatus;
    }

    public void setTbupStatus(Byte tbupStatus) {
        this.tbupStatus = tbupStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbupId=").append(tbupId);
        sb.append(", tbupHost=").append(tbupHost);
        sb.append(", tbupInfo=").append(tbupInfo);
        sb.append(", tbupGroup=").append(tbupGroup);
        sb.append(", tbupMember=").append(tbupMember);
        sb.append(", tbupQuota=").append(tbupQuota);
        sb.append(", tbupUpdateTime=").append(tbupUpdateTime);
        sb.append(", tbupAddTime=").append(tbupAddTime);
        sb.append(", tbupStatus=").append(tbupStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}