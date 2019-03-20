package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Refund implements Serializable {
    private Integer tbrId;

    private Short tbrHost;

    private Integer tbrMember;

    private String tbrTradeNo;

    private Byte tbrDepositType;

    private Date tbrDepositTime;

    private Date tbrLastUse;

    private Double tbrRefunded;

    private Byte tbrReturnType;

    private Long tbrBankType;

    private String tbrBankBranch;

    private String tbrAccountNo;

    private String tbrAccountName;

    private String tbrMobile;

    private Integer tbrRecord;

    private Integer tbrChecker;

    private Integer tbrBacker;

    private String tbrPostil;

    private Date tbrAddTime;

    private Date tbrCheckTime;

    private Date tbrBackTime;

    private Date tbrEndTime;

    private String tbrRemark;

    private Short tbrLongType;

    private Byte tbrStatus;

    private Date createtime;

    private Date modifydate;

    private String tbrTbrNo;

    private static final long serialVersionUID = 1L;

    public Integer getTbrId() {
        return tbrId;
    }

    public void setTbrId(Integer tbrId) {
        this.tbrId = tbrId;
    }

    public Short getTbrHost() {
        return tbrHost;
    }

    public void setTbrHost(Short tbrHost) {
        this.tbrHost = tbrHost;
    }

    public Integer getTbrMember() {
        return tbrMember;
    }

    public void setTbrMember(Integer tbrMember) {
        this.tbrMember = tbrMember;
    }

    public String getTbrTradeNo() {
        return tbrTradeNo;
    }

    public void setTbrTradeNo(String tbrTradeNo) {
        this.tbrTradeNo = tbrTradeNo == null ? null : tbrTradeNo.trim();
    }

    public Byte getTbrDepositType() {
        return tbrDepositType;
    }

    public void setTbrDepositType(Byte tbrDepositType) {
        this.tbrDepositType = tbrDepositType;
    }

    public Date getTbrDepositTime() {
        return tbrDepositTime;
    }

    public void setTbrDepositTime(Date tbrDepositTime) {
        this.tbrDepositTime = tbrDepositTime;
    }

    public Date getTbrLastUse() {
        return tbrLastUse;
    }

    public void setTbrLastUse(Date tbrLastUse) {
        this.tbrLastUse = tbrLastUse;
    }

    public Double getTbrRefunded() {
        return tbrRefunded;
    }

    public void setTbrRefunded(Double tbrRefunded) {
        this.tbrRefunded = tbrRefunded;
    }

    public Byte getTbrReturnType() {
        return tbrReturnType;
    }

    public void setTbrReturnType(Byte tbrReturnType) {
        this.tbrReturnType = tbrReturnType;
    }

    public Long getTbrBankType() {
        return tbrBankType;
    }

    public void setTbrBankType(Long tbrBankType) {
        this.tbrBankType = tbrBankType;
    }

    public String getTbrBankBranch() {
        return tbrBankBranch;
    }

    public void setTbrBankBranch(String tbrBankBranch) {
        this.tbrBankBranch = tbrBankBranch == null ? null : tbrBankBranch.trim();
    }

    public String getTbrAccountNo() {
        return tbrAccountNo;
    }

    public void setTbrAccountNo(String tbrAccountNo) {
        this.tbrAccountNo = tbrAccountNo == null ? null : tbrAccountNo.trim();
    }

    public String getTbrAccountName() {
        return tbrAccountName;
    }

    public void setTbrAccountName(String tbrAccountName) {
        this.tbrAccountName = tbrAccountName == null ? null : tbrAccountName.trim();
    }

    public String getTbrMobile() {
        return tbrMobile;
    }

    public void setTbrMobile(String tbrMobile) {
        this.tbrMobile = tbrMobile == null ? null : tbrMobile.trim();
    }

    public Integer getTbrRecord() {
        return tbrRecord;
    }

    public void setTbrRecord(Integer tbrRecord) {
        this.tbrRecord = tbrRecord;
    }

    public Integer getTbrChecker() {
        return tbrChecker;
    }

    public void setTbrChecker(Integer tbrChecker) {
        this.tbrChecker = tbrChecker;
    }

    public Integer getTbrBacker() {
        return tbrBacker;
    }

    public void setTbrBacker(Integer tbrBacker) {
        this.tbrBacker = tbrBacker;
    }

    public String getTbrPostil() {
        return tbrPostil;
    }

    public void setTbrPostil(String tbrPostil) {
        this.tbrPostil = tbrPostil == null ? null : tbrPostil.trim();
    }

    public Date getTbrAddTime() {
        return tbrAddTime;
    }

    public void setTbrAddTime(Date tbrAddTime) {
        this.tbrAddTime = tbrAddTime;
    }

    public Date getTbrCheckTime() {
        return tbrCheckTime;
    }

    public void setTbrCheckTime(Date tbrCheckTime) {
        this.tbrCheckTime = tbrCheckTime;
    }

    public Date getTbrBackTime() {
        return tbrBackTime;
    }

    public void setTbrBackTime(Date tbrBackTime) {
        this.tbrBackTime = tbrBackTime;
    }

    public Date getTbrEndTime() {
        return tbrEndTime;
    }

    public void setTbrEndTime(Date tbrEndTime) {
        this.tbrEndTime = tbrEndTime;
    }

    public String getTbrRemark() {
        return tbrRemark;
    }

    public void setTbrRemark(String tbrRemark) {
        this.tbrRemark = tbrRemark == null ? null : tbrRemark.trim();
    }

    public Short getTbrLongType() {
        return tbrLongType;
    }

    public void setTbrLongType(Short tbrLongType) {
        this.tbrLongType = tbrLongType;
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

    public String getTbrTbrNo() {
        return tbrTbrNo;
    }

    public void setTbrTbrNo(String tbrTbrNo) {
        this.tbrTbrNo = tbrTbrNo == null ? null : tbrTbrNo.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbrId=").append(tbrId);
        sb.append(", tbrHost=").append(tbrHost);
        sb.append(", tbrMember=").append(tbrMember);
        sb.append(", tbrTradeNo=").append(tbrTradeNo);
        sb.append(", tbrDepositType=").append(tbrDepositType);
        sb.append(", tbrDepositTime=").append(tbrDepositTime);
        sb.append(", tbrLastUse=").append(tbrLastUse);
        sb.append(", tbrRefunded=").append(tbrRefunded);
        sb.append(", tbrReturnType=").append(tbrReturnType);
        sb.append(", tbrBankType=").append(tbrBankType);
        sb.append(", tbrBankBranch=").append(tbrBankBranch);
        sb.append(", tbrAccountNo=").append(tbrAccountNo);
        sb.append(", tbrAccountName=").append(tbrAccountName);
        sb.append(", tbrMobile=").append(tbrMobile);
        sb.append(", tbrRecord=").append(tbrRecord);
        sb.append(", tbrChecker=").append(tbrChecker);
        sb.append(", tbrBacker=").append(tbrBacker);
        sb.append(", tbrPostil=").append(tbrPostil);
        sb.append(", tbrAddTime=").append(tbrAddTime);
        sb.append(", tbrCheckTime=").append(tbrCheckTime);
        sb.append(", tbrBackTime=").append(tbrBackTime);
        sb.append(", tbrEndTime=").append(tbrEndTime);
        sb.append(", tbrRemark=").append(tbrRemark);
        sb.append(", tbrLongType=").append(tbrLongType);
        sb.append(", tbrStatus=").append(tbrStatus);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", tbrTbrNo=").append(tbrTbrNo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}