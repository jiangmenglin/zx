package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Account implements Serializable {
    private Integer tbaId;

    private Integer tbaMember;

    private BigDecimal tbaDeposit;

    private BigDecimal tbaMoney;

    private Double tbaLongDepsit;

    private Integer tbaIntegral;

    private String tbaRemark;

    private Byte tbaStatus;

    private static final long serialVersionUID = 1L;

    public Integer getTbaId() {
        return tbaId;
    }

    public void setTbaId(Integer tbaId) {
        this.tbaId = tbaId;
    }

    public Integer getTbaMember() {
        return tbaMember;
    }

    public void setTbaMember(Integer tbaMember) {
        this.tbaMember = tbaMember;
    }

    public BigDecimal getTbaDeposit() {
        return tbaDeposit;
    }

    public void setTbaDeposit(BigDecimal tbaDeposit) {
        this.tbaDeposit = tbaDeposit;
    }

    public BigDecimal getTbaMoney() {
        return tbaMoney;
    }

    public void setTbaMoney(BigDecimal tbaMoney) {
        this.tbaMoney = tbaMoney;
    }

    public Double getTbaLongDepsit() {
        return tbaLongDepsit;
    }

    public void setTbaLongDepsit(Double tbaLongDepsit) {
        this.tbaLongDepsit = tbaLongDepsit;
    }

    public Integer getTbaIntegral() {
        return tbaIntegral;
    }

    public void setTbaIntegral(Integer tbaIntegral) {
        this.tbaIntegral = tbaIntegral;
    }

    public String getTbaRemark() {
        return tbaRemark;
    }

    public void setTbaRemark(String tbaRemark) {
        this.tbaRemark = tbaRemark == null ? null : tbaRemark.trim();
    }

    public Byte getTbaStatus() {
        return tbaStatus;
    }

    public void setTbaStatus(Byte tbaStatus) {
        this.tbaStatus = tbaStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbaId=").append(tbaId);
        sb.append(", tbaMember=").append(tbaMember);
        sb.append(", tbaDeposit=").append(tbaDeposit);
        sb.append(", tbaMoney=").append(tbaMoney);
        sb.append(", tbaLongDepsit=").append(tbaLongDepsit);
        sb.append(", tbaIntegral=").append(tbaIntegral);
        sb.append(", tbaRemark=").append(tbaRemark);
        sb.append(", tbaStatus=").append(tbaStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}