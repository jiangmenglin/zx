package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class PayLog implements Serializable {
    private Long tbplId;

    private Short tbplBankType;

    private Long tbplRecord;

    private Long tbplRefund;

    private String tbplRelate;

    private Short tbplType;

    private Date tbplAddTime;

    private Short tbplStatus;

    private String tbplLog;

    private static final long serialVersionUID = 1L;

    public Long getTbplId() {
        return tbplId;
    }

    public void setTbplId(Long tbplId) {
        this.tbplId = tbplId;
    }

    public Short getTbplBankType() {
        return tbplBankType;
    }

    public void setTbplBankType(Short tbplBankType) {
        this.tbplBankType = tbplBankType;
    }

    public Long getTbplRecord() {
        return tbplRecord;
    }

    public void setTbplRecord(Long tbplRecord) {
        this.tbplRecord = tbplRecord;
    }

    public Long getTbplRefund() {
        return tbplRefund;
    }

    public void setTbplRefund(Long tbplRefund) {
        this.tbplRefund = tbplRefund;
    }

    public String getTbplRelate() {
        return tbplRelate;
    }

    public void setTbplRelate(String tbplRelate) {
        this.tbplRelate = tbplRelate == null ? null : tbplRelate.trim();
    }

    public Short getTbplType() {
        return tbplType;
    }

    public void setTbplType(Short tbplType) {
        this.tbplType = tbplType;
    }

    public Date getTbplAddTime() {
        return tbplAddTime;
    }

    public void setTbplAddTime(Date tbplAddTime) {
        this.tbplAddTime = tbplAddTime;
    }

    public Short getTbplStatus() {
        return tbplStatus;
    }

    public void setTbplStatus(Short tbplStatus) {
        this.tbplStatus = tbplStatus;
    }

    public String getTbplLog() {
        return tbplLog;
    }

    public void setTbplLog(String tbplLog) {
        this.tbplLog = tbplLog == null ? null : tbplLog.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbplId=").append(tbplId);
        sb.append(", tbplBankType=").append(tbplBankType);
        sb.append(", tbplRecord=").append(tbplRecord);
        sb.append(", tbplRefund=").append(tbplRefund);
        sb.append(", tbplRelate=").append(tbplRelate);
        sb.append(", tbplType=").append(tbplType);
        sb.append(", tbplAddTime=").append(tbplAddTime);
        sb.append(", tbplStatus=").append(tbplStatus);
        sb.append(", tbplLog=").append(tbplLog);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}