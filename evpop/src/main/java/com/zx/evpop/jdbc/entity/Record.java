package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Record implements Serializable {
    private Long tbrId;

    private Short tbrHost;

    private String tbrNo;

    private String tbrTradeNo;

    private String tbrProfile;

    private Integer tbrMember;

    private Byte tbrMoneyType;

    private Integer tbrRecordSubject;

    private BigDecimal tbrIn;

    private BigDecimal tbrOut;

    private BigDecimal tbrAmount;

    private Date tbrAddTime;

    private String tbrRemark;

    private Long tbrOrder;

    private Long tbrLongOrder;

    private String tbrRelate;

    private Integer tbrEditor;

    private String tbrSerial;

    private Byte tbrStatus;

    private Date createtime;

    private Date modifydate;

    private static final long serialVersionUID = 1L;

    public Long getTbrId() {
        return tbrId;
    }

    public void setTbrId(Long tbrId) {
        this.tbrId = tbrId;
    }

    public Short getTbrHost() {
        return tbrHost;
    }

    public void setTbrHost(Short tbrHost) {
        this.tbrHost = tbrHost;
    }

    public String getTbrNo() {
        return tbrNo;
    }

    public void setTbrNo(String tbrNo) {
        this.tbrNo = tbrNo == null ? null : tbrNo.trim();
    }

    public String getTbrTradeNo() {
        return tbrTradeNo;
    }

    public void setTbrTradeNo(String tbrTradeNo) {
        this.tbrTradeNo = tbrTradeNo == null ? null : tbrTradeNo.trim();
    }

    public String getTbrProfile() {
        return tbrProfile;
    }

    public void setTbrProfile(String tbrProfile) {
        this.tbrProfile = tbrProfile == null ? null : tbrProfile.trim();
    }

    public Integer getTbrMember() {
        return tbrMember;
    }

    public void setTbrMember(Integer tbrMember) {
        this.tbrMember = tbrMember;
    }

    public Byte getTbrMoneyType() {
        return tbrMoneyType;
    }

    public void setTbrMoneyType(Byte tbrMoneyType) {
        this.tbrMoneyType = tbrMoneyType;
    }

    public Integer getTbrRecordSubject() {
        return tbrRecordSubject;
    }

    public void setTbrRecordSubject(Integer tbrRecordSubject) {
        this.tbrRecordSubject = tbrRecordSubject;
    }

    public BigDecimal getTbrIn() {
        return tbrIn;
    }

    public void setTbrIn(BigDecimal tbrIn) {
        this.tbrIn = tbrIn;
    }

    public BigDecimal getTbrOut() {
        return tbrOut;
    }

    public void setTbrOut(BigDecimal tbrOut) {
        this.tbrOut = tbrOut;
    }

    public BigDecimal getTbrAmount() {
        return tbrAmount;
    }

    public void setTbrAmount(BigDecimal tbrAmount) {
        this.tbrAmount = tbrAmount;
    }

    public Date getTbrAddTime() {
        return tbrAddTime;
    }

    public void setTbrAddTime(Date tbrAddTime) {
        this.tbrAddTime = tbrAddTime;
    }

    public String getTbrRemark() {
        return tbrRemark;
    }

    public void setTbrRemark(String tbrRemark) {
        this.tbrRemark = tbrRemark == null ? null : tbrRemark.trim();
    }

    public Long getTbrOrder() {
        return tbrOrder;
    }

    public void setTbrOrder(Long tbrOrder) {
        this.tbrOrder = tbrOrder;
    }

    public Long getTbrLongOrder() {
        return tbrLongOrder;
    }

    public void setTbrLongOrder(Long tbrLongOrder) {
        this.tbrLongOrder = tbrLongOrder;
    }

    public String getTbrRelate() {
        return tbrRelate;
    }

    public void setTbrRelate(String tbrRelate) {
        this.tbrRelate = tbrRelate == null ? null : tbrRelate.trim();
    }

    public Integer getTbrEditor() {
        return tbrEditor;
    }

    public void setTbrEditor(Integer tbrEditor) {
        this.tbrEditor = tbrEditor;
    }

    public String getTbrSerial() {
        return tbrSerial;
    }

    public void setTbrSerial(String tbrSerial) {
        this.tbrSerial = tbrSerial == null ? null : tbrSerial.trim();
    }

    public Byte getTbrStatus() {
        return tbrStatus;
    }

    public void setTbrStatus(Byte tbrStatus) {
        this.tbrStatus = tbrStatus;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbrId=").append(tbrId);
        sb.append(", tbrHost=").append(tbrHost);
        sb.append(", tbrNo=").append(tbrNo);
        sb.append(", tbrTradeNo=").append(tbrTradeNo);
        sb.append(", tbrProfile=").append(tbrProfile);
        sb.append(", tbrMember=").append(tbrMember);
        sb.append(", tbrMoneyType=").append(tbrMoneyType);
        sb.append(", tbrRecordSubject=").append(tbrRecordSubject);
        sb.append(", tbrIn=").append(tbrIn);
        sb.append(", tbrOut=").append(tbrOut);
        sb.append(", tbrAmount=").append(tbrAmount);
        sb.append(", tbrAddTime=").append(tbrAddTime);
        sb.append(", tbrRemark=").append(tbrRemark);
        sb.append(", tbrOrder=").append(tbrOrder);
        sb.append(", tbrLongOrder=").append(tbrLongOrder);
        sb.append(", tbrRelate=").append(tbrRelate);
        sb.append(", tbrEditor=").append(tbrEditor);
        sb.append(", tbrSerial=").append(tbrSerial);
        sb.append(", tbrStatus=").append(tbrStatus);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}