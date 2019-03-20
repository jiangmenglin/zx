package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Oper implements Serializable {
    private Long tboId;

    private String tboName;

    private String tboFullName;

    private String tboIcon;

    private String tboSign;

    private String tboPerson;

    private String tboAddress;

    private String tboContacts;

    private Long tboAdder;

    private String tboRemark;

    private Date tboUpdateTime;

    private Date tboAddTime;

    private Short tboStatus;

    private String tboMemo;

    private String tboData;

    private static final long serialVersionUID = 1L;

    public Long getTboId() {
        return tboId;
    }

    public void setTboId(Long tboId) {
        this.tboId = tboId;
    }

    public String getTboName() {
        return tboName;
    }

    public void setTboName(String tboName) {
        this.tboName = tboName == null ? null : tboName.trim();
    }

    public String getTboFullName() {
        return tboFullName;
    }

    public void setTboFullName(String tboFullName) {
        this.tboFullName = tboFullName == null ? null : tboFullName.trim();
    }

    public String getTboIcon() {
        return tboIcon;
    }

    public void setTboIcon(String tboIcon) {
        this.tboIcon = tboIcon == null ? null : tboIcon.trim();
    }

    public String getTboSign() {
        return tboSign;
    }

    public void setTboSign(String tboSign) {
        this.tboSign = tboSign == null ? null : tboSign.trim();
    }

    public String getTboPerson() {
        return tboPerson;
    }

    public void setTboPerson(String tboPerson) {
        this.tboPerson = tboPerson == null ? null : tboPerson.trim();
    }

    public String getTboAddress() {
        return tboAddress;
    }

    public void setTboAddress(String tboAddress) {
        this.tboAddress = tboAddress == null ? null : tboAddress.trim();
    }

    public String getTboContacts() {
        return tboContacts;
    }

    public void setTboContacts(String tboContacts) {
        this.tboContacts = tboContacts == null ? null : tboContacts.trim();
    }

    public Long getTboAdder() {
        return tboAdder;
    }

    public void setTboAdder(Long tboAdder) {
        this.tboAdder = tboAdder;
    }

    public String getTboRemark() {
        return tboRemark;
    }

    public void setTboRemark(String tboRemark) {
        this.tboRemark = tboRemark == null ? null : tboRemark.trim();
    }

    public Date getTboUpdateTime() {
        return tboUpdateTime;
    }

    public void setTboUpdateTime(Date tboUpdateTime) {
        this.tboUpdateTime = tboUpdateTime;
    }

    public Date getTboAddTime() {
        return tboAddTime;
    }

    public void setTboAddTime(Date tboAddTime) {
        this.tboAddTime = tboAddTime;
    }

    public Short getTboStatus() {
        return tboStatus;
    }

    public void setTboStatus(Short tboStatus) {
        this.tboStatus = tboStatus;
    }

    public String getTboMemo() {
        return tboMemo;
    }

    public void setTboMemo(String tboMemo) {
        this.tboMemo = tboMemo == null ? null : tboMemo.trim();
    }

    public String getTboData() {
        return tboData;
    }

    public void setTboData(String tboData) {
        this.tboData = tboData == null ? null : tboData.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tboId=").append(tboId);
        sb.append(", tboName=").append(tboName);
        sb.append(", tboFullName=").append(tboFullName);
        sb.append(", tboIcon=").append(tboIcon);
        sb.append(", tboSign=").append(tboSign);
        sb.append(", tboPerson=").append(tboPerson);
        sb.append(", tboAddress=").append(tboAddress);
        sb.append(", tboContacts=").append(tboContacts);
        sb.append(", tboAdder=").append(tboAdder);
        sb.append(", tboRemark=").append(tboRemark);
        sb.append(", tboUpdateTime=").append(tboUpdateTime);
        sb.append(", tboAddTime=").append(tboAddTime);
        sb.append(", tboStatus=").append(tboStatus);
        sb.append(", tboMemo=").append(tboMemo);
        sb.append(", tboData=").append(tboData);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}