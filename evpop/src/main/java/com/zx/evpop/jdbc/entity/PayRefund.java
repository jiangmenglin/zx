package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class PayRefund implements Serializable {
    private Long tbprId;

    private Long tbprHost;

    private Short tbprBankType;

    private String tbprTradeNo;

    private Long tbprMember;

    private String tbprRealName;

    private Double tbprAmount;

    private Long tbprRefund;

    private Long tbprPayRecord;

    private Long tbprRecord;

    private String tbprAlipayNo;

    private Date tbprUpdateTime;

    private Date tbprAddTime;

    private Short tbprStatus;

    private static final long serialVersionUID = 1L;

    public Long getTbprId() {
        return tbprId;
    }

    public void setTbprId(Long tbprId) {
        this.tbprId = tbprId;
    }

    public Long getTbprHost() {
        return tbprHost;
    }

    public void setTbprHost(Long tbprHost) {
        this.tbprHost = tbprHost;
    }

    public Short getTbprBankType() {
        return tbprBankType;
    }

    public void setTbprBankType(Short tbprBankType) {
        this.tbprBankType = tbprBankType;
    }

    public String getTbprTradeNo() {
        return tbprTradeNo;
    }

    public void setTbprTradeNo(String tbprTradeNo) {
        this.tbprTradeNo = tbprTradeNo == null ? null : tbprTradeNo.trim();
    }

    public Long getTbprMember() {
        return tbprMember;
    }

    public void setTbprMember(Long tbprMember) {
        this.tbprMember = tbprMember;
    }

    public String getTbprRealName() {
        return tbprRealName;
    }

    public void setTbprRealName(String tbprRealName) {
        this.tbprRealName = tbprRealName == null ? null : tbprRealName.trim();
    }

    public Double getTbprAmount() {
        return tbprAmount;
    }

    public void setTbprAmount(Double tbprAmount) {
        this.tbprAmount = tbprAmount;
    }

    public Long getTbprRefund() {
        return tbprRefund;
    }

    public void setTbprRefund(Long tbprRefund) {
        this.tbprRefund = tbprRefund;
    }

    public Long getTbprPayRecord() {
        return tbprPayRecord;
    }

    public void setTbprPayRecord(Long tbprPayRecord) {
        this.tbprPayRecord = tbprPayRecord;
    }

    public Long getTbprRecord() {
        return tbprRecord;
    }

    public void setTbprRecord(Long tbprRecord) {
        this.tbprRecord = tbprRecord;
    }

    public String getTbprAlipayNo() {
        return tbprAlipayNo;
    }

    public void setTbprAlipayNo(String tbprAlipayNo) {
        this.tbprAlipayNo = tbprAlipayNo == null ? null : tbprAlipayNo.trim();
    }

    public Date getTbprUpdateTime() {
        return tbprUpdateTime;
    }

    public void setTbprUpdateTime(Date tbprUpdateTime) {
        this.tbprUpdateTime = tbprUpdateTime;
    }

    public Date getTbprAddTime() {
        return tbprAddTime;
    }

    public void setTbprAddTime(Date tbprAddTime) {
        this.tbprAddTime = tbprAddTime;
    }

    public Short getTbprStatus() {
        return tbprStatus;
    }

    public void setTbprStatus(Short tbprStatus) {
        this.tbprStatus = tbprStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbprId=").append(tbprId);
        sb.append(", tbprHost=").append(tbprHost);
        sb.append(", tbprBankType=").append(tbprBankType);
        sb.append(", tbprTradeNo=").append(tbprTradeNo);
        sb.append(", tbprMember=").append(tbprMember);
        sb.append(", tbprRealName=").append(tbprRealName);
        sb.append(", tbprAmount=").append(tbprAmount);
        sb.append(", tbprRefund=").append(tbprRefund);
        sb.append(", tbprPayRecord=").append(tbprPayRecord);
        sb.append(", tbprRecord=").append(tbprRecord);
        sb.append(", tbprAlipayNo=").append(tbprAlipayNo);
        sb.append(", tbprUpdateTime=").append(tbprUpdateTime);
        sb.append(", tbprAddTime=").append(tbprAddTime);
        sb.append(", tbprStatus=").append(tbprStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}