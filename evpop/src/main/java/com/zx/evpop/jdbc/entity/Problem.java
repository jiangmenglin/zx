package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Problem implements Serializable {
    private Long tbpId;

    private Long tbpHost;

    private Long tbpCar;

    private Byte tbpType;

    private String tbpProfile;

    private String tbpImages;

    private Long tbpManage;

    private Date tbpCheckTime;

    private String tbpRemark;

    private Date tbpUpdateTime;

    private Date tbpAddTime;

    private Byte tbpStatus;

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

    public Long getTbpCar() {
        return tbpCar;
    }

    public void setTbpCar(Long tbpCar) {
        this.tbpCar = tbpCar;
    }

    public Byte getTbpType() {
        return tbpType;
    }

    public void setTbpType(Byte tbpType) {
        this.tbpType = tbpType;
    }

    public String getTbpProfile() {
        return tbpProfile;
    }

    public void setTbpProfile(String tbpProfile) {
        this.tbpProfile = tbpProfile == null ? null : tbpProfile.trim();
    }

    public String getTbpImages() {
        return tbpImages;
    }

    public void setTbpImages(String tbpImages) {
        this.tbpImages = tbpImages == null ? null : tbpImages.trim();
    }

    public Long getTbpManage() {
        return tbpManage;
    }

    public void setTbpManage(Long tbpManage) {
        this.tbpManage = tbpManage;
    }

    public Date getTbpCheckTime() {
        return tbpCheckTime;
    }

    public void setTbpCheckTime(Date tbpCheckTime) {
        this.tbpCheckTime = tbpCheckTime;
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

    public Byte getTbpStatus() {
        return tbpStatus;
    }

    public void setTbpStatus(Byte tbpStatus) {
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
        sb.append(", tbpCar=").append(tbpCar);
        sb.append(", tbpType=").append(tbpType);
        sb.append(", tbpProfile=").append(tbpProfile);
        sb.append(", tbpImages=").append(tbpImages);
        sb.append(", tbpManage=").append(tbpManage);
        sb.append(", tbpCheckTime=").append(tbpCheckTime);
        sb.append(", tbpRemark=").append(tbpRemark);
        sb.append(", tbpUpdateTime=").append(tbpUpdateTime);
        sb.append(", tbpAddTime=").append(tbpAddTime);
        sb.append(", tbpStatus=").append(tbpStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}