package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class UnitInfo implements Serializable {
    private Integer tbuiId;

    private Short tbuiHost;

    private String tbuiUsername;

    private String tbuiPassword;

    private String tbuiName;

    private String tbuiPerson;

    private Byte tbuiType;

    private Short tbuiLevel;

    private String tbuiAddress;

    private String tbuiContact;

    private String tbuiImages;

    private Integer tbuiMember;

    private Double tbuiCredit;

    private Integer tbuiOutlets;

    private Integer tbuiFeeType;

    private Byte tbuiUseType;

    private Date tbuiUpdateTime;

    private Date tbuiAddTime;

    private String tbuiRemark;

    private Byte tbuiStatus;

    private Date createtime;

    private Date modifydate;

    private Byte tbuiNeedDeposit;

    private static final long serialVersionUID = 1L;

    public Integer getTbuiId() {
        return tbuiId;
    }

    public void setTbuiId(Integer tbuiId) {
        this.tbuiId = tbuiId;
    }

    public Short getTbuiHost() {
        return tbuiHost;
    }

    public void setTbuiHost(Short tbuiHost) {
        this.tbuiHost = tbuiHost;
    }

    public String getTbuiUsername() {
        return tbuiUsername;
    }

    public void setTbuiUsername(String tbuiUsername) {
        this.tbuiUsername = tbuiUsername == null ? null : tbuiUsername.trim();
    }

    public String getTbuiPassword() {
        return tbuiPassword;
    }

    public void setTbuiPassword(String tbuiPassword) {
        this.tbuiPassword = tbuiPassword == null ? null : tbuiPassword.trim();
    }

    public String getTbuiName() {
        return tbuiName;
    }

    public void setTbuiName(String tbuiName) {
        this.tbuiName = tbuiName == null ? null : tbuiName.trim();
    }

    public String getTbuiPerson() {
        return tbuiPerson;
    }

    public void setTbuiPerson(String tbuiPerson) {
        this.tbuiPerson = tbuiPerson == null ? null : tbuiPerson.trim();
    }

    public Byte getTbuiType() {
        return tbuiType;
    }

    public void setTbuiType(Byte tbuiType) {
        this.tbuiType = tbuiType;
    }

    public Short getTbuiLevel() {
        return tbuiLevel;
    }

    public void setTbuiLevel(Short tbuiLevel) {
        this.tbuiLevel = tbuiLevel;
    }

    public String getTbuiAddress() {
        return tbuiAddress;
    }

    public void setTbuiAddress(String tbuiAddress) {
        this.tbuiAddress = tbuiAddress == null ? null : tbuiAddress.trim();
    }

    public String getTbuiContact() {
        return tbuiContact;
    }

    public void setTbuiContact(String tbuiContact) {
        this.tbuiContact = tbuiContact == null ? null : tbuiContact.trim();
    }

    public String getTbuiImages() {
        return tbuiImages;
    }

    public void setTbuiImages(String tbuiImages) {
        this.tbuiImages = tbuiImages == null ? null : tbuiImages.trim();
    }

    public Integer getTbuiMember() {
        return tbuiMember;
    }

    public void setTbuiMember(Integer tbuiMember) {
        this.tbuiMember = tbuiMember;
    }

    public Double getTbuiCredit() {
        return tbuiCredit;
    }

    public void setTbuiCredit(Double tbuiCredit) {
        this.tbuiCredit = tbuiCredit;
    }

    public Integer getTbuiOutlets() {
        return tbuiOutlets;
    }

    public void setTbuiOutlets(Integer tbuiOutlets) {
        this.tbuiOutlets = tbuiOutlets;
    }

    public Integer getTbuiFeeType() {
        return tbuiFeeType;
    }

    public void setTbuiFeeType(Integer tbuiFeeType) {
        this.tbuiFeeType = tbuiFeeType;
    }

    public Byte getTbuiUseType() {
        return tbuiUseType;
    }

    public void setTbuiUseType(Byte tbuiUseType) {
        this.tbuiUseType = tbuiUseType;
    }

    public Date getTbuiUpdateTime() {
        return tbuiUpdateTime;
    }

    public void setTbuiUpdateTime(Date tbuiUpdateTime) {
        this.tbuiUpdateTime = tbuiUpdateTime;
    }

    public Date getTbuiAddTime() {
        return tbuiAddTime;
    }

    public void setTbuiAddTime(Date tbuiAddTime) {
        this.tbuiAddTime = tbuiAddTime;
    }

    public String getTbuiRemark() {
        return tbuiRemark;
    }

    public void setTbuiRemark(String tbuiRemark) {
        this.tbuiRemark = tbuiRemark == null ? null : tbuiRemark.trim();
    }

    public Byte getTbuiStatus() {
        return tbuiStatus;
    }

    public void setTbuiStatus(Byte tbuiStatus) {
        this.tbuiStatus = tbuiStatus;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public Byte getTbuiNeedDeposit() {
        return tbuiNeedDeposit;
    }

    public void setTbuiNeedDeposit(Byte tbuiNeedDeposit) {
        this.tbuiNeedDeposit = tbuiNeedDeposit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbuiId=").append(tbuiId);
        sb.append(", tbuiHost=").append(tbuiHost);
        sb.append(", tbuiUsername=").append(tbuiUsername);
        sb.append(", tbuiPassword=").append(tbuiPassword);
        sb.append(", tbuiName=").append(tbuiName);
        sb.append(", tbuiPerson=").append(tbuiPerson);
        sb.append(", tbuiType=").append(tbuiType);
        sb.append(", tbuiLevel=").append(tbuiLevel);
        sb.append(", tbuiAddress=").append(tbuiAddress);
        sb.append(", tbuiContact=").append(tbuiContact);
        sb.append(", tbuiImages=").append(tbuiImages);
        sb.append(", tbuiMember=").append(tbuiMember);
        sb.append(", tbuiCredit=").append(tbuiCredit);
        sb.append(", tbuiOutlets=").append(tbuiOutlets);
        sb.append(", tbuiFeeType=").append(tbuiFeeType);
        sb.append(", tbuiUseType=").append(tbuiUseType);
        sb.append(", tbuiUpdateTime=").append(tbuiUpdateTime);
        sb.append(", tbuiAddTime=").append(tbuiAddTime);
        sb.append(", tbuiRemark=").append(tbuiRemark);
        sb.append(", tbuiStatus=").append(tbuiStatus);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", tbuiNeedDeposit=").append(tbuiNeedDeposit);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}