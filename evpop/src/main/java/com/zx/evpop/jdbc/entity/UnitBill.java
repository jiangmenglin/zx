package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class UnitBill implements Serializable {
    private Long tbubId;

    private Long tbubHost;

    private String tbubMonth;

    private Long tbubUnit;

    private Integer tbubOrderS;

    private Double tbubNeedPay;

    private Double tbubRealPay;

    private Long tbubEditor;

    private Date tbubUpdateTime;

    private Date tbubAddTime;

    private Short tbubStatus;

    private static final long serialVersionUID = 1L;

    public Long getTbubId() {
        return tbubId;
    }

    public void setTbubId(Long tbubId) {
        this.tbubId = tbubId;
    }

    public Long getTbubHost() {
        return tbubHost;
    }

    public void setTbubHost(Long tbubHost) {
        this.tbubHost = tbubHost;
    }

    public String getTbubMonth() {
        return tbubMonth;
    }

    public void setTbubMonth(String tbubMonth) {
        this.tbubMonth = tbubMonth == null ? null : tbubMonth.trim();
    }

    public Long getTbubUnit() {
        return tbubUnit;
    }

    public void setTbubUnit(Long tbubUnit) {
        this.tbubUnit = tbubUnit;
    }

    public Integer getTbubOrderS() {
        return tbubOrderS;
    }

    public void setTbubOrderS(Integer tbubOrderS) {
        this.tbubOrderS = tbubOrderS;
    }

    public Double getTbubNeedPay() {
        return tbubNeedPay;
    }

    public void setTbubNeedPay(Double tbubNeedPay) {
        this.tbubNeedPay = tbubNeedPay;
    }

    public Double getTbubRealPay() {
        return tbubRealPay;
    }

    public void setTbubRealPay(Double tbubRealPay) {
        this.tbubRealPay = tbubRealPay;
    }

    public Long getTbubEditor() {
        return tbubEditor;
    }

    public void setTbubEditor(Long tbubEditor) {
        this.tbubEditor = tbubEditor;
    }

    public Date getTbubUpdateTime() {
        return tbubUpdateTime;
    }

    public void setTbubUpdateTime(Date tbubUpdateTime) {
        this.tbubUpdateTime = tbubUpdateTime;
    }

    public Date getTbubAddTime() {
        return tbubAddTime;
    }

    public void setTbubAddTime(Date tbubAddTime) {
        this.tbubAddTime = tbubAddTime;
    }

    public Short getTbubStatus() {
        return tbubStatus;
    }

    public void setTbubStatus(Short tbubStatus) {
        this.tbubStatus = tbubStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbubId=").append(tbubId);
        sb.append(", tbubHost=").append(tbubHost);
        sb.append(", tbubMonth=").append(tbubMonth);
        sb.append(", tbubUnit=").append(tbubUnit);
        sb.append(", tbubOrderS=").append(tbubOrderS);
        sb.append(", tbubNeedPay=").append(tbubNeedPay);
        sb.append(", tbubRealPay=").append(tbubRealPay);
        sb.append(", tbubEditor=").append(tbubEditor);
        sb.append(", tbubUpdateTime=").append(tbubUpdateTime);
        sb.append(", tbubAddTime=").append(tbubAddTime);
        sb.append(", tbubStatus=").append(tbubStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}