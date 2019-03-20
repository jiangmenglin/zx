package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class District implements Serializable {
    private Long tbdId;

    private Long tbdHost;

    private String tbdName;

    private String tbdFlag;

    private Double tbdLon;

    private Double tbdLat;

    private Date tbdAddTime;

    private Date tbdUpdateTime;

    private Byte tbdStatus;

    private String tbdRange;

    private static final long serialVersionUID = 1L;

    public Long getTbdId() {
        return tbdId;
    }

    public void setTbdId(Long tbdId) {
        this.tbdId = tbdId;
    }

    public Long getTbdHost() {
        return tbdHost;
    }

    public void setTbdHost(Long tbdHost) {
        this.tbdHost = tbdHost;
    }

    public String getTbdName() {
        return tbdName;
    }

    public void setTbdName(String tbdName) {
        this.tbdName = tbdName == null ? null : tbdName.trim();
    }

    public String getTbdFlag() {
        return tbdFlag;
    }

    public void setTbdFlag(String tbdFlag) {
        this.tbdFlag = tbdFlag == null ? null : tbdFlag.trim();
    }

    public Double getTbdLon() {
        return tbdLon;
    }

    public void setTbdLon(Double tbdLon) {
        this.tbdLon = tbdLon;
    }

    public Double getTbdLat() {
        return tbdLat;
    }

    public void setTbdLat(Double tbdLat) {
        this.tbdLat = tbdLat;
    }

    public Date getTbdAddTime() {
        return tbdAddTime;
    }

    public void setTbdAddTime(Date tbdAddTime) {
        this.tbdAddTime = tbdAddTime;
    }

    public Date getTbdUpdateTime() {
        return tbdUpdateTime;
    }

    public void setTbdUpdateTime(Date tbdUpdateTime) {
        this.tbdUpdateTime = tbdUpdateTime;
    }

    public Byte getTbdStatus() {
        return tbdStatus;
    }

    public void setTbdStatus(Byte tbdStatus) {
        this.tbdStatus = tbdStatus;
    }

    public String getTbdRange() {
        return tbdRange;
    }

    public void setTbdRange(String tbdRange) {
        this.tbdRange = tbdRange == null ? null : tbdRange.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbdId=").append(tbdId);
        sb.append(", tbdHost=").append(tbdHost);
        sb.append(", tbdName=").append(tbdName);
        sb.append(", tbdFlag=").append(tbdFlag);
        sb.append(", tbdLon=").append(tbdLon);
        sb.append(", tbdLat=").append(tbdLat);
        sb.append(", tbdAddTime=").append(tbdAddTime);
        sb.append(", tbdUpdateTime=").append(tbdUpdateTime);
        sb.append(", tbdStatus=").append(tbdStatus);
        sb.append(", tbdRange=").append(tbdRange);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}