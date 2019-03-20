package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Integral implements Serializable {
    private Integer tbiId;

    private Short tbiHost;

    private Integer tbiMember;

    private Byte tbiType;

    private Double tbiAmount;

    private String tbiRemark;

    private Date tbiAddTime;

    private String tbiRelate;

    private String tbiSerial;

    private Integer tbiEditor;

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

    public Integer getTbiMember() {
        return tbiMember;
    }

    public void setTbiMember(Integer tbiMember) {
        this.tbiMember = tbiMember;
    }

    public Byte getTbiType() {
        return tbiType;
    }

    public void setTbiType(Byte tbiType) {
        this.tbiType = tbiType;
    }

    public Double getTbiAmount() {
        return tbiAmount;
    }

    public void setTbiAmount(Double tbiAmount) {
        this.tbiAmount = tbiAmount;
    }

    public String getTbiRemark() {
        return tbiRemark;
    }

    public void setTbiRemark(String tbiRemark) {
        this.tbiRemark = tbiRemark == null ? null : tbiRemark.trim();
    }

    public Date getTbiAddTime() {
        return tbiAddTime;
    }

    public void setTbiAddTime(Date tbiAddTime) {
        this.tbiAddTime = tbiAddTime;
    }

    public String getTbiRelate() {
        return tbiRelate;
    }

    public void setTbiRelate(String tbiRelate) {
        this.tbiRelate = tbiRelate == null ? null : tbiRelate.trim();
    }

    public String getTbiSerial() {
        return tbiSerial;
    }

    public void setTbiSerial(String tbiSerial) {
        this.tbiSerial = tbiSerial == null ? null : tbiSerial.trim();
    }

    public Integer getTbiEditor() {
        return tbiEditor;
    }

    public void setTbiEditor(Integer tbiEditor) {
        this.tbiEditor = tbiEditor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbiId=").append(tbiId);
        sb.append(", tbiHost=").append(tbiHost);
        sb.append(", tbiMember=").append(tbiMember);
        sb.append(", tbiType=").append(tbiType);
        sb.append(", tbiAmount=").append(tbiAmount);
        sb.append(", tbiRemark=").append(tbiRemark);
        sb.append(", tbiAddTime=").append(tbiAddTime);
        sb.append(", tbiRelate=").append(tbiRelate);
        sb.append(", tbiSerial=").append(tbiSerial);
        sb.append(", tbiEditor=").append(tbiEditor);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}