package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class AoCheck implements Serializable {
    private Integer tbacId;

    private String tbacTitle;

    private Integer tbacUser;

    private String tbacInPos;

    private String tbacInAddress;

    private Date tbacInTime;

    private String tbacOutPos;

    private String tbacOutAddress;

    private Date tbacOutTime;

    private Integer tbacTimeLong;

    private String tbacRemark;

    private Byte tbacStatus;

    private static final long serialVersionUID = 1L;

    public Integer getTbacId() {
        return tbacId;
    }

    public void setTbacId(Integer tbacId) {
        this.tbacId = tbacId;
    }

    public String getTbacTitle() {
        return tbacTitle;
    }

    public void setTbacTitle(String tbacTitle) {
        this.tbacTitle = tbacTitle == null ? null : tbacTitle.trim();
    }

    public Integer getTbacUser() {
        return tbacUser;
    }

    public void setTbacUser(Integer tbacUser) {
        this.tbacUser = tbacUser;
    }

    public String getTbacInPos() {
        return tbacInPos;
    }

    public void setTbacInPos(String tbacInPos) {
        this.tbacInPos = tbacInPos == null ? null : tbacInPos.trim();
    }

    public String getTbacInAddress() {
        return tbacInAddress;
    }

    public void setTbacInAddress(String tbacInAddress) {
        this.tbacInAddress = tbacInAddress == null ? null : tbacInAddress.trim();
    }

    public Date getTbacInTime() {
        return tbacInTime;
    }

    public void setTbacInTime(Date tbacInTime) {
        this.tbacInTime = tbacInTime;
    }

    public String getTbacOutPos() {
        return tbacOutPos;
    }

    public void setTbacOutPos(String tbacOutPos) {
        this.tbacOutPos = tbacOutPos == null ? null : tbacOutPos.trim();
    }

    public String getTbacOutAddress() {
        return tbacOutAddress;
    }

    public void setTbacOutAddress(String tbacOutAddress) {
        this.tbacOutAddress = tbacOutAddress == null ? null : tbacOutAddress.trim();
    }

    public Date getTbacOutTime() {
        return tbacOutTime;
    }

    public void setTbacOutTime(Date tbacOutTime) {
        this.tbacOutTime = tbacOutTime;
    }

    public Integer getTbacTimeLong() {
        return tbacTimeLong;
    }

    public void setTbacTimeLong(Integer tbacTimeLong) {
        this.tbacTimeLong = tbacTimeLong;
    }

    public String getTbacRemark() {
        return tbacRemark;
    }

    public void setTbacRemark(String tbacRemark) {
        this.tbacRemark = tbacRemark == null ? null : tbacRemark.trim();
    }

    public Byte getTbacStatus() {
        return tbacStatus;
    }

    public void setTbacStatus(Byte tbacStatus) {
        this.tbacStatus = tbacStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbacId=").append(tbacId);
        sb.append(", tbacTitle=").append(tbacTitle);
        sb.append(", tbacUser=").append(tbacUser);
        sb.append(", tbacInPos=").append(tbacInPos);
        sb.append(", tbacInAddress=").append(tbacInAddress);
        sb.append(", tbacInTime=").append(tbacInTime);
        sb.append(", tbacOutPos=").append(tbacOutPos);
        sb.append(", tbacOutAddress=").append(tbacOutAddress);
        sb.append(", tbacOutTime=").append(tbacOutTime);
        sb.append(", tbacTimeLong=").append(tbacTimeLong);
        sb.append(", tbacRemark=").append(tbacRemark);
        sb.append(", tbacStatus=").append(tbacStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}