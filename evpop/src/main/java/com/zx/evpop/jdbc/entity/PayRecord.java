package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PayRecord implements Serializable {
    private Integer tbprId;

    private Short tbprHost;

    private Byte tbprPayType;

    private Byte tbprBankType;

    private String tbprTradeNo;

    private Integer tbprMember;

    private String tbprRealName;

    private BigDecimal tbprAmount;

    private BigDecimal tbprRefund;

    private String tbprPayMethod;

    private String tbprBlank;

    private String tbprAlipayNo;

    private String tbprBuyerAccount;

    private Integer tbprRecord;

    private Integer tbprClientId;

    private String tbprThirdBack;

    private Date tbprArrivalTime;

    private Date tbprUpdateTime;

    private Date tbprAddTime;

    private Byte tbprStatus;

    private Date createtime;

    private Date modifydate;

    private static final long serialVersionUID = 1L;

    public Integer getTbprId() {
        return tbprId;
    }

    public void setTbprId(Integer tbprId) {
        this.tbprId = tbprId;
    }

    public Short getTbprHost() {
        return tbprHost;
    }

    public void setTbprHost(Short tbprHost) {
        this.tbprHost = tbprHost;
    }

    public Byte getTbprPayType() {
        return tbprPayType;
    }

    public void setTbprPayType(Byte tbprPayType) {
        this.tbprPayType = tbprPayType;
    }

    public Byte getTbprBankType() {
        return tbprBankType;
    }

    public void setTbprBankType(Byte tbprBankType) {
        this.tbprBankType = tbprBankType;
    }

    public String getTbprTradeNo() {
        return tbprTradeNo;
    }

    public void setTbprTradeNo(String tbprTradeNo) {
        this.tbprTradeNo = tbprTradeNo == null ? null : tbprTradeNo.trim();
    }

    public Integer getTbprMember() {
        return tbprMember;
    }

    public void setTbprMember(Integer tbprMember) {
        this.tbprMember = tbprMember;
    }

    public String getTbprRealName() {
        return tbprRealName;
    }

    public void setTbprRealName(String tbprRealName) {
        this.tbprRealName = tbprRealName == null ? null : tbprRealName.trim();
    }

    public BigDecimal getTbprAmount() {
        return tbprAmount;
    }

    public void setTbprAmount(BigDecimal tbprAmount) {
        this.tbprAmount = tbprAmount;
    }

    public BigDecimal getTbprRefund() {
        return tbprRefund;
    }

    public void setTbprRefund(BigDecimal tbprRefund) {
        this.tbprRefund = tbprRefund;
    }

    public String getTbprPayMethod() {
        return tbprPayMethod;
    }

    public void setTbprPayMethod(String tbprPayMethod) {
        this.tbprPayMethod = tbprPayMethod == null ? null : tbprPayMethod.trim();
    }

    public String getTbprBlank() {
        return tbprBlank;
    }

    public void setTbprBlank(String tbprBlank) {
        this.tbprBlank = tbprBlank == null ? null : tbprBlank.trim();
    }

    public String getTbprAlipayNo() {
        return tbprAlipayNo;
    }

    public void setTbprAlipayNo(String tbprAlipayNo) {
        this.tbprAlipayNo = tbprAlipayNo == null ? null : tbprAlipayNo.trim();
    }

    public String getTbprBuyerAccount() {
        return tbprBuyerAccount;
    }

    public void setTbprBuyerAccount(String tbprBuyerAccount) {
        this.tbprBuyerAccount = tbprBuyerAccount == null ? null : tbprBuyerAccount.trim();
    }

    public Integer getTbprRecord() {
        return tbprRecord;
    }

    public void setTbprRecord(Integer tbprRecord) {
        this.tbprRecord = tbprRecord;
    }

    public Integer getTbprClientId() {
        return tbprClientId;
    }

    public void setTbprClientId(Integer tbprClientId) {
        this.tbprClientId = tbprClientId;
    }

    public String getTbprThirdBack() {
        return tbprThirdBack;
    }

    public void setTbprThirdBack(String tbprThirdBack) {
        this.tbprThirdBack = tbprThirdBack == null ? null : tbprThirdBack.trim();
    }

    public Date getTbprArrivalTime() {
        return tbprArrivalTime;
    }

    public void setTbprArrivalTime(Date tbprArrivalTime) {
        this.tbprArrivalTime = tbprArrivalTime;
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

    public Byte getTbprStatus() {
        return tbprStatus;
    }

    public void setTbprStatus(Byte tbprStatus) {
        this.tbprStatus = tbprStatus;
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
        sb.append(", tbprId=").append(tbprId);
        sb.append(", tbprHost=").append(tbprHost);
        sb.append(", tbprPayType=").append(tbprPayType);
        sb.append(", tbprBankType=").append(tbprBankType);
        sb.append(", tbprTradeNo=").append(tbprTradeNo);
        sb.append(", tbprMember=").append(tbprMember);
        sb.append(", tbprRealName=").append(tbprRealName);
        sb.append(", tbprAmount=").append(tbprAmount);
        sb.append(", tbprRefund=").append(tbprRefund);
        sb.append(", tbprPayMethod=").append(tbprPayMethod);
        sb.append(", tbprBlank=").append(tbprBlank);
        sb.append(", tbprAlipayNo=").append(tbprAlipayNo);
        sb.append(", tbprBuyerAccount=").append(tbprBuyerAccount);
        sb.append(", tbprRecord=").append(tbprRecord);
        sb.append(", tbprClientId=").append(tbprClientId);
        sb.append(", tbprThirdBack=").append(tbprThirdBack);
        sb.append(", tbprArrivalTime=").append(tbprArrivalTime);
        sb.append(", tbprUpdateTime=").append(tbprUpdateTime);
        sb.append(", tbprAddTime=").append(tbprAddTime);
        sb.append(", tbprStatus=").append(tbprStatus);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}