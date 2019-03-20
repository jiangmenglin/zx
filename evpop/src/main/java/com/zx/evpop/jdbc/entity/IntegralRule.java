package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class IntegralRule implements Serializable {
    private Integer tbirId;

    private String tbirName;

    private String tbirFlag;

    private Integer tbirMoney;

    private String tbirDepict;

    private BigDecimal tbirIntegral;

    private Date tbirUpdateTime;

    private Date tbirAddTime;

    private Byte tbirStatus;

    private Date createtime;

    private Date modifydate;

    private static final long serialVersionUID = 1L;

    public Integer getTbirId() {
        return tbirId;
    }

    public void setTbirId(Integer tbirId) {
        this.tbirId = tbirId;
    }

    public String getTbirName() {
        return tbirName;
    }

    public void setTbirName(String tbirName) {
        this.tbirName = tbirName == null ? null : tbirName.trim();
    }

    public String getTbirFlag() {
        return tbirFlag;
    }

    public void setTbirFlag(String tbirFlag) {
        this.tbirFlag = tbirFlag == null ? null : tbirFlag.trim();
    }

    public Integer getTbirMoney() {
        return tbirMoney;
    }

    public void setTbirMoney(Integer tbirMoney) {
        this.tbirMoney = tbirMoney;
    }

    public String getTbirDepict() {
        return tbirDepict;
    }

    public void setTbirDepict(String tbirDepict) {
        this.tbirDepict = tbirDepict == null ? null : tbirDepict.trim();
    }

    public BigDecimal getTbirIntegral() {
        return tbirIntegral;
    }

    public void setTbirIntegral(BigDecimal tbirIntegral) {
        this.tbirIntegral = tbirIntegral;
    }

    public Date getTbirUpdateTime() {
        return tbirUpdateTime;
    }

    public void setTbirUpdateTime(Date tbirUpdateTime) {
        this.tbirUpdateTime = tbirUpdateTime;
    }

    public Date getTbirAddTime() {
        return tbirAddTime;
    }

    public void setTbirAddTime(Date tbirAddTime) {
        this.tbirAddTime = tbirAddTime;
    }

    public Byte getTbirStatus() {
        return tbirStatus;
    }

    public void setTbirStatus(Byte tbirStatus) {
        this.tbirStatus = tbirStatus;
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
        sb.append(", tbirId=").append(tbirId);
        sb.append(", tbirName=").append(tbirName);
        sb.append(", tbirFlag=").append(tbirFlag);
        sb.append(", tbirMoney=").append(tbirMoney);
        sb.append(", tbirDepict=").append(tbirDepict);
        sb.append(", tbirIntegral=").append(tbirIntegral);
        sb.append(", tbirUpdateTime=").append(tbirUpdateTime);
        sb.append(", tbirAddTime=").append(tbirAddTime);
        sb.append(", tbirStatus=").append(tbirStatus);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}