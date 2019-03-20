package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Goods implements Serializable {
    private Long tbgId;

    private String tbgName;

    private Short tbgProduct;

    private String tbgFlag;

    private String tbgPriority;

    private String tbgExpre;

    private String tbgMeas;

    private String tbgProfile;

    private Date tbgUpdateTime;

    private Date tbgAddTime;

    private Short tbgStatus;

    private static final long serialVersionUID = 1L;

    public Long getTbgId() {
        return tbgId;
    }

    public void setTbgId(Long tbgId) {
        this.tbgId = tbgId;
    }

    public String getTbgName() {
        return tbgName;
    }

    public void setTbgName(String tbgName) {
        this.tbgName = tbgName == null ? null : tbgName.trim();
    }

    public Short getTbgProduct() {
        return tbgProduct;
    }

    public void setTbgProduct(Short tbgProduct) {
        this.tbgProduct = tbgProduct;
    }

    public String getTbgFlag() {
        return tbgFlag;
    }

    public void setTbgFlag(String tbgFlag) {
        this.tbgFlag = tbgFlag == null ? null : tbgFlag.trim();
    }

    public String getTbgPriority() {
        return tbgPriority;
    }

    public void setTbgPriority(String tbgPriority) {
        this.tbgPriority = tbgPriority == null ? null : tbgPriority.trim();
    }

    public String getTbgExpre() {
        return tbgExpre;
    }

    public void setTbgExpre(String tbgExpre) {
        this.tbgExpre = tbgExpre == null ? null : tbgExpre.trim();
    }

    public String getTbgMeas() {
        return tbgMeas;
    }

    public void setTbgMeas(String tbgMeas) {
        this.tbgMeas = tbgMeas == null ? null : tbgMeas.trim();
    }

    public String getTbgProfile() {
        return tbgProfile;
    }

    public void setTbgProfile(String tbgProfile) {
        this.tbgProfile = tbgProfile == null ? null : tbgProfile.trim();
    }

    public Date getTbgUpdateTime() {
        return tbgUpdateTime;
    }

    public void setTbgUpdateTime(Date tbgUpdateTime) {
        this.tbgUpdateTime = tbgUpdateTime;
    }

    public Date getTbgAddTime() {
        return tbgAddTime;
    }

    public void setTbgAddTime(Date tbgAddTime) {
        this.tbgAddTime = tbgAddTime;
    }

    public Short getTbgStatus() {
        return tbgStatus;
    }

    public void setTbgStatus(Short tbgStatus) {
        this.tbgStatus = tbgStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbgId=").append(tbgId);
        sb.append(", tbgName=").append(tbgName);
        sb.append(", tbgProduct=").append(tbgProduct);
        sb.append(", tbgFlag=").append(tbgFlag);
        sb.append(", tbgPriority=").append(tbgPriority);
        sb.append(", tbgExpre=").append(tbgExpre);
        sb.append(", tbgMeas=").append(tbgMeas);
        sb.append(", tbgProfile=").append(tbgProfile);
        sb.append(", tbgUpdateTime=").append(tbgUpdateTime);
        sb.append(", tbgAddTime=").append(tbgAddTime);
        sb.append(", tbgStatus=").append(tbgStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}