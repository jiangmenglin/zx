package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class LongOrderFee implements Serializable {
    private Long tblofId;

    private Long tblofHost;

    private Long tblofLongorder;

    private String tblofName;

    private Short tblofType;

    private Double tblofAmmount;

    private Long tblofPayRecord;

    private Long tblofRetRecord;

    private String tblofRemark;

    private Date tblofUpdateTime;

    private Date tblofAddTime;

    private Short tblofStatus;

    private static final long serialVersionUID = 1L;

    public Long getTblofId() {
        return tblofId;
    }

    public void setTblofId(Long tblofId) {
        this.tblofId = tblofId;
    }

    public Long getTblofHost() {
        return tblofHost;
    }

    public void setTblofHost(Long tblofHost) {
        this.tblofHost = tblofHost;
    }

    public Long getTblofLongorder() {
        return tblofLongorder;
    }

    public void setTblofLongorder(Long tblofLongorder) {
        this.tblofLongorder = tblofLongorder;
    }

    public String getTblofName() {
        return tblofName;
    }

    public void setTblofName(String tblofName) {
        this.tblofName = tblofName == null ? null : tblofName.trim();
    }

    public Short getTblofType() {
        return tblofType;
    }

    public void setTblofType(Short tblofType) {
        this.tblofType = tblofType;
    }

    public Double getTblofAmmount() {
        return tblofAmmount;
    }

    public void setTblofAmmount(Double tblofAmmount) {
        this.tblofAmmount = tblofAmmount;
    }

    public Long getTblofPayRecord() {
        return tblofPayRecord;
    }

    public void setTblofPayRecord(Long tblofPayRecord) {
        this.tblofPayRecord = tblofPayRecord;
    }

    public Long getTblofRetRecord() {
        return tblofRetRecord;
    }

    public void setTblofRetRecord(Long tblofRetRecord) {
        this.tblofRetRecord = tblofRetRecord;
    }

    public String getTblofRemark() {
        return tblofRemark;
    }

    public void setTblofRemark(String tblofRemark) {
        this.tblofRemark = tblofRemark == null ? null : tblofRemark.trim();
    }

    public Date getTblofUpdateTime() {
        return tblofUpdateTime;
    }

    public void setTblofUpdateTime(Date tblofUpdateTime) {
        this.tblofUpdateTime = tblofUpdateTime;
    }

    public Date getTblofAddTime() {
        return tblofAddTime;
    }

    public void setTblofAddTime(Date tblofAddTime) {
        this.tblofAddTime = tblofAddTime;
    }

    public Short getTblofStatus() {
        return tblofStatus;
    }

    public void setTblofStatus(Short tblofStatus) {
        this.tblofStatus = tblofStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tblofId=").append(tblofId);
        sb.append(", tblofHost=").append(tblofHost);
        sb.append(", tblofLongorder=").append(tblofLongorder);
        sb.append(", tblofName=").append(tblofName);
        sb.append(", tblofType=").append(tblofType);
        sb.append(", tblofAmmount=").append(tblofAmmount);
        sb.append(", tblofPayRecord=").append(tblofPayRecord);
        sb.append(", tblofRetRecord=").append(tblofRetRecord);
        sb.append(", tblofRemark=").append(tblofRemark);
        sb.append(", tblofUpdateTime=").append(tblofUpdateTime);
        sb.append(", tblofAddTime=").append(tblofAddTime);
        sb.append(", tblofStatus=").append(tblofStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}