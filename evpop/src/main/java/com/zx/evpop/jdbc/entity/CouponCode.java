package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class CouponCode implements Serializable {
    private Integer tbccId;

    private Short tbccHost;

    private String tbccCode;

    private Integer tbccCouponType;

    private Integer tbccMember;

    private String tbccRemark;

    private Date tbccRchTime;

    private Date tbccUpdateTime;

    private Date tbccAddTime;

    private Byte tbccStatus;

    private static final long serialVersionUID = 1L;

    public Integer getTbccId() {
        return tbccId;
    }

    public void setTbccId(Integer tbccId) {
        this.tbccId = tbccId;
    }

    public Short getTbccHost() {
        return tbccHost;
    }

    public void setTbccHost(Short tbccHost) {
        this.tbccHost = tbccHost;
    }

    public String getTbccCode() {
        return tbccCode;
    }

    public void setTbccCode(String tbccCode) {
        this.tbccCode = tbccCode == null ? null : tbccCode.trim();
    }

    public Integer getTbccCouponType() {
        return tbccCouponType;
    }

    public void setTbccCouponType(Integer tbccCouponType) {
        this.tbccCouponType = tbccCouponType;
    }

    public Integer getTbccMember() {
        return tbccMember;
    }

    public void setTbccMember(Integer tbccMember) {
        this.tbccMember = tbccMember;
    }

    public String getTbccRemark() {
        return tbccRemark;
    }

    public void setTbccRemark(String tbccRemark) {
        this.tbccRemark = tbccRemark == null ? null : tbccRemark.trim();
    }

    public Date getTbccRchTime() {
        return tbccRchTime;
    }

    public void setTbccRchTime(Date tbccRchTime) {
        this.tbccRchTime = tbccRchTime;
    }

    public Date getTbccUpdateTime() {
        return tbccUpdateTime;
    }

    public void setTbccUpdateTime(Date tbccUpdateTime) {
        this.tbccUpdateTime = tbccUpdateTime;
    }

    public Date getTbccAddTime() {
        return tbccAddTime;
    }

    public void setTbccAddTime(Date tbccAddTime) {
        this.tbccAddTime = tbccAddTime;
    }

    public Byte getTbccStatus() {
        return tbccStatus;
    }

    public void setTbccStatus(Byte tbccStatus) {
        this.tbccStatus = tbccStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbccId=").append(tbccId);
        sb.append(", tbccHost=").append(tbccHost);
        sb.append(", tbccCode=").append(tbccCode);
        sb.append(", tbccCouponType=").append(tbccCouponType);
        sb.append(", tbccMember=").append(tbccMember);
        sb.append(", tbccRemark=").append(tbccRemark);
        sb.append(", tbccRchTime=").append(tbccRchTime);
        sb.append(", tbccUpdateTime=").append(tbccUpdateTime);
        sb.append(", tbccAddTime=").append(tbccAddTime);
        sb.append(", tbccStatus=").append(tbccStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}