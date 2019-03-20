package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class CodeScanConfig implements Serializable {
    private Long tbcscId;

    private String tbcscName;

    private Long tbcscHost;

    private String tbcscCodeId;

    private Long tbcscCouponType;

    private Integer scanTimes;

    private Date tbcscUpdateTime;

    private Date tbcscAddTime;

    private Short tbcscStatus;

    private static final long serialVersionUID = 1L;

    public Long getTbcscId() {
        return tbcscId;
    }

    public void setTbcscId(Long tbcscId) {
        this.tbcscId = tbcscId;
    }

    public String getTbcscName() {
        return tbcscName;
    }

    public void setTbcscName(String tbcscName) {
        this.tbcscName = tbcscName == null ? null : tbcscName.trim();
    }

    public Long getTbcscHost() {
        return tbcscHost;
    }

    public void setTbcscHost(Long tbcscHost) {
        this.tbcscHost = tbcscHost;
    }

    public String getTbcscCodeId() {
        return tbcscCodeId;
    }

    public void setTbcscCodeId(String tbcscCodeId) {
        this.tbcscCodeId = tbcscCodeId == null ? null : tbcscCodeId.trim();
    }

    public Long getTbcscCouponType() {
        return tbcscCouponType;
    }

    public void setTbcscCouponType(Long tbcscCouponType) {
        this.tbcscCouponType = tbcscCouponType;
    }

    public Integer getScanTimes() {
        return scanTimes;
    }

    public void setScanTimes(Integer scanTimes) {
        this.scanTimes = scanTimes;
    }

    public Date getTbcscUpdateTime() {
        return tbcscUpdateTime;
    }

    public void setTbcscUpdateTime(Date tbcscUpdateTime) {
        this.tbcscUpdateTime = tbcscUpdateTime;
    }

    public Date getTbcscAddTime() {
        return tbcscAddTime;
    }

    public void setTbcscAddTime(Date tbcscAddTime) {
        this.tbcscAddTime = tbcscAddTime;
    }

    public Short getTbcscStatus() {
        return tbcscStatus;
    }

    public void setTbcscStatus(Short tbcscStatus) {
        this.tbcscStatus = tbcscStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbcscId=").append(tbcscId);
        sb.append(", tbcscName=").append(tbcscName);
        sb.append(", tbcscHost=").append(tbcscHost);
        sb.append(", tbcscCodeId=").append(tbcscCodeId);
        sb.append(", tbcscCouponType=").append(tbcscCouponType);
        sb.append(", scanTimes=").append(scanTimes);
        sb.append(", tbcscUpdateTime=").append(tbcscUpdateTime);
        sb.append(", tbcscAddTime=").append(tbcscAddTime);
        sb.append(", tbcscStatus=").append(tbcscStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}