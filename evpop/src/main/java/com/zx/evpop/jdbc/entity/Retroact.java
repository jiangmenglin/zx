package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Retroact implements Serializable {
    private Integer tbrId;

    private String tbrMobile;

    private String tbrName;

    private Integer tbrCategory;

    private String tbrRemark;

    private String tbrImages;

    private Long tbrOrder;

    private Date tbrAddTime;

    private Date tbrUpdateTime;

    private Byte tbrStatus;

    private static final long serialVersionUID = 1L;

    public Integer getTbrId() {
        return tbrId;
    }

    public void setTbrId(Integer tbrId) {
        this.tbrId = tbrId;
    }

    public String getTbrMobile() {
        return tbrMobile;
    }

    public void setTbrMobile(String tbrMobile) {
        this.tbrMobile = tbrMobile == null ? null : tbrMobile.trim();
    }

    public String getTbrName() {
        return tbrName;
    }

    public void setTbrName(String tbrName) {
        this.tbrName = tbrName == null ? null : tbrName.trim();
    }

    public Integer getTbrCategory() {
        return tbrCategory;
    }

    public void setTbrCategory(Integer tbrCategory) {
        this.tbrCategory = tbrCategory;
    }

    public String getTbrRemark() {
        return tbrRemark;
    }

    public void setTbrRemark(String tbrRemark) {
        this.tbrRemark = tbrRemark == null ? null : tbrRemark.trim();
    }

    public String getTbrImages() {
        return tbrImages;
    }

    public void setTbrImages(String tbrImages) {
        this.tbrImages = tbrImages == null ? null : tbrImages.trim();
    }

    public Long getTbrOrder() {
        return tbrOrder;
    }

    public void setTbrOrder(Long tbrOrder) {
        this.tbrOrder = tbrOrder;
    }

    public Date getTbrAddTime() {
        return tbrAddTime;
    }

    public void setTbrAddTime(Date tbrAddTime) {
        this.tbrAddTime = tbrAddTime;
    }

    public Date getTbrUpdateTime() {
        return tbrUpdateTime;
    }

    public void setTbrUpdateTime(Date tbrUpdateTime) {
        this.tbrUpdateTime = tbrUpdateTime;
    }

    public Byte getTbrStatus() {
        return tbrStatus;
    }

    public void setTbrStatus(Byte tbrStatus) {
        this.tbrStatus = tbrStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbrId=").append(tbrId);
        sb.append(", tbrMobile=").append(tbrMobile);
        sb.append(", tbrName=").append(tbrName);
        sb.append(", tbrCategory=").append(tbrCategory);
        sb.append(", tbrRemark=").append(tbrRemark);
        sb.append(", tbrImages=").append(tbrImages);
        sb.append(", tbrOrder=").append(tbrOrder);
        sb.append(", tbrAddTime=").append(tbrAddTime);
        sb.append(", tbrUpdateTime=").append(tbrUpdateTime);
        sb.append(", tbrStatus=").append(tbrStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}