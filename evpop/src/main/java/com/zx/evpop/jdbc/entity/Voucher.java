package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Voucher implements Serializable {
    private Long tbvId;

    private Long tbvHost;

    private String tbvProfile;

    private Double tbvMoney;

    private String tbvVoucher;

    private String tbvUuid;

    private Long tbvAdder;

    private String tbvRemark;

    private Date tbvUpdateTime;

    private Date tbvAddTime;

    private Short tbvStatus;

    private static final long serialVersionUID = 1L;

    public Long getTbvId() {
        return tbvId;
    }

    public void setTbvId(Long tbvId) {
        this.tbvId = tbvId;
    }

    public Long getTbvHost() {
        return tbvHost;
    }

    public void setTbvHost(Long tbvHost) {
        this.tbvHost = tbvHost;
    }

    public String getTbvProfile() {
        return tbvProfile;
    }

    public void setTbvProfile(String tbvProfile) {
        this.tbvProfile = tbvProfile == null ? null : tbvProfile.trim();
    }

    public Double getTbvMoney() {
        return tbvMoney;
    }

    public void setTbvMoney(Double tbvMoney) {
        this.tbvMoney = tbvMoney;
    }

    public String getTbvVoucher() {
        return tbvVoucher;
    }

    public void setTbvVoucher(String tbvVoucher) {
        this.tbvVoucher = tbvVoucher == null ? null : tbvVoucher.trim();
    }

    public String getTbvUuid() {
        return tbvUuid;
    }

    public void setTbvUuid(String tbvUuid) {
        this.tbvUuid = tbvUuid == null ? null : tbvUuid.trim();
    }

    public Long getTbvAdder() {
        return tbvAdder;
    }

    public void setTbvAdder(Long tbvAdder) {
        this.tbvAdder = tbvAdder;
    }

    public String getTbvRemark() {
        return tbvRemark;
    }

    public void setTbvRemark(String tbvRemark) {
        this.tbvRemark = tbvRemark == null ? null : tbvRemark.trim();
    }

    public Date getTbvUpdateTime() {
        return tbvUpdateTime;
    }

    public void setTbvUpdateTime(Date tbvUpdateTime) {
        this.tbvUpdateTime = tbvUpdateTime;
    }

    public Date getTbvAddTime() {
        return tbvAddTime;
    }

    public void setTbvAddTime(Date tbvAddTime) {
        this.tbvAddTime = tbvAddTime;
    }

    public Short getTbvStatus() {
        return tbvStatus;
    }

    public void setTbvStatus(Short tbvStatus) {
        this.tbvStatus = tbvStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbvId=").append(tbvId);
        sb.append(", tbvHost=").append(tbvHost);
        sb.append(", tbvProfile=").append(tbvProfile);
        sb.append(", tbvMoney=").append(tbvMoney);
        sb.append(", tbvVoucher=").append(tbvVoucher);
        sb.append(", tbvUuid=").append(tbvUuid);
        sb.append(", tbvAdder=").append(tbvAdder);
        sb.append(", tbvRemark=").append(tbvRemark);
        sb.append(", tbvUpdateTime=").append(tbvUpdateTime);
        sb.append(", tbvAddTime=").append(tbvAddTime);
        sb.append(", tbvStatus=").append(tbvStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}