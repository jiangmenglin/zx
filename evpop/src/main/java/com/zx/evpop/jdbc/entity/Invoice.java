package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Invoice implements Serializable {
    private Integer tbiId;

    private Short tbiHost;

    private String tbiTitle;

    private Short tbiType;

    private String tbiTariffNo;

    private Double tbiMoney;

    private Integer tbiMember;

    private Byte tbiSendType;

    private String tbiName;

    private String tbiContact;

    private String tbiAddress;

    private Integer tbiChecker;

    private Integer tbiEditor;

    private String tbiZipcode;

    private Integer tbiAdder;

    private String tbiPostil;

    private String tbiRemark;

    private Date tbiCheckTime;

    private String tbiInvoiceNo;

    private Date tbiInvoiceTime;

    private Date tbiUpdateTime;

    private Date tbiAddTime;

    private Byte tbiStatus;

    private Date createtime;

    private Date modifydate;

    private static final long serialVersionUID = 1L;

    public Integer getTbiId() {
        return tbiId;
    }

    public void setTbiId(Integer tbiId) {
        this.tbiId = tbiId;
    }

    public Short getTbiHost() {
        return tbiHost;
    }

    public void setTbiHost(Short tbiHost) {
        this.tbiHost = tbiHost;
    }

    public String getTbiTitle() {
        return tbiTitle;
    }

    public void setTbiTitle(String tbiTitle) {
        this.tbiTitle = tbiTitle == null ? null : tbiTitle.trim();
    }

    public Short getTbiType() {
        return tbiType;
    }

    public void setTbiType(Short tbiType) {
        this.tbiType = tbiType;
    }

    public String getTbiTariffNo() {
        return tbiTariffNo;
    }

    public void setTbiTariffNo(String tbiTariffNo) {
        this.tbiTariffNo = tbiTariffNo == null ? null : tbiTariffNo.trim();
    }

    public Double getTbiMoney() {
        return tbiMoney;
    }

    public void setTbiMoney(Double tbiMoney) {
        this.tbiMoney = tbiMoney;
    }

    public Integer getTbiMember() {
        return tbiMember;
    }

    public void setTbiMember(Integer tbiMember) {
        this.tbiMember = tbiMember;
    }

    public Byte getTbiSendType() {
        return tbiSendType;
    }

    public void setTbiSendType(Byte tbiSendType) {
        this.tbiSendType = tbiSendType;
    }

    public String getTbiName() {
        return tbiName;
    }

    public void setTbiName(String tbiName) {
        this.tbiName = tbiName == null ? null : tbiName.trim();
    }

    public String getTbiContact() {
        return tbiContact;
    }

    public void setTbiContact(String tbiContact) {
        this.tbiContact = tbiContact == null ? null : tbiContact.trim();
    }

    public String getTbiAddress() {
        return tbiAddress;
    }

    public void setTbiAddress(String tbiAddress) {
        this.tbiAddress = tbiAddress == null ? null : tbiAddress.trim();
    }

    public Integer getTbiChecker() {
        return tbiChecker;
    }

    public void setTbiChecker(Integer tbiChecker) {
        this.tbiChecker = tbiChecker;
    }

    public Integer getTbiEditor() {
        return tbiEditor;
    }

    public void setTbiEditor(Integer tbiEditor) {
        this.tbiEditor = tbiEditor;
    }

    public String getTbiZipcode() {
        return tbiZipcode;
    }

    public void setTbiZipcode(String tbiZipcode) {
        this.tbiZipcode = tbiZipcode == null ? null : tbiZipcode.trim();
    }

    public Integer getTbiAdder() {
        return tbiAdder;
    }

    public void setTbiAdder(Integer tbiAdder) {
        this.tbiAdder = tbiAdder;
    }

    public String getTbiPostil() {
        return tbiPostil;
    }

    public void setTbiPostil(String tbiPostil) {
        this.tbiPostil = tbiPostil == null ? null : tbiPostil.trim();
    }

    public String getTbiRemark() {
        return tbiRemark;
    }

    public void setTbiRemark(String tbiRemark) {
        this.tbiRemark = tbiRemark == null ? null : tbiRemark.trim();
    }

    public Date getTbiCheckTime() {
        return tbiCheckTime;
    }

    public void setTbiCheckTime(Date tbiCheckTime) {
        this.tbiCheckTime = tbiCheckTime;
    }

    public String getTbiInvoiceNo() {
        return tbiInvoiceNo;
    }

    public void setTbiInvoiceNo(String tbiInvoiceNo) {
        this.tbiInvoiceNo = tbiInvoiceNo == null ? null : tbiInvoiceNo.trim();
    }

    public Date getTbiInvoiceTime() {
        return tbiInvoiceTime;
    }

    public void setTbiInvoiceTime(Date tbiInvoiceTime) {
        this.tbiInvoiceTime = tbiInvoiceTime;
    }

    public Date getTbiUpdateTime() {
        return tbiUpdateTime;
    }

    public void setTbiUpdateTime(Date tbiUpdateTime) {
        this.tbiUpdateTime = tbiUpdateTime;
    }

    public Date getTbiAddTime() {
        return tbiAddTime;
    }

    public void setTbiAddTime(Date tbiAddTime) {
        this.tbiAddTime = tbiAddTime;
    }

    public Byte getTbiStatus() {
        return tbiStatus;
    }

    public void setTbiStatus(Byte tbiStatus) {
        this.tbiStatus = tbiStatus;
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
        sb.append(", tbiId=").append(tbiId);
        sb.append(", tbiHost=").append(tbiHost);
        sb.append(", tbiTitle=").append(tbiTitle);
        sb.append(", tbiType=").append(tbiType);
        sb.append(", tbiTariffNo=").append(tbiTariffNo);
        sb.append(", tbiMoney=").append(tbiMoney);
        sb.append(", tbiMember=").append(tbiMember);
        sb.append(", tbiSendType=").append(tbiSendType);
        sb.append(", tbiName=").append(tbiName);
        sb.append(", tbiContact=").append(tbiContact);
        sb.append(", tbiAddress=").append(tbiAddress);
        sb.append(", tbiChecker=").append(tbiChecker);
        sb.append(", tbiEditor=").append(tbiEditor);
        sb.append(", tbiZipcode=").append(tbiZipcode);
        sb.append(", tbiAdder=").append(tbiAdder);
        sb.append(", tbiPostil=").append(tbiPostil);
        sb.append(", tbiRemark=").append(tbiRemark);
        sb.append(", tbiCheckTime=").append(tbiCheckTime);
        sb.append(", tbiInvoiceNo=").append(tbiInvoiceNo);
        sb.append(", tbiInvoiceTime=").append(tbiInvoiceTime);
        sb.append(", tbiUpdateTime=").append(tbiUpdateTime);
        sb.append(", tbiAddTime=").append(tbiAddTime);
        sb.append(", tbiStatus=").append(tbiStatus);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}