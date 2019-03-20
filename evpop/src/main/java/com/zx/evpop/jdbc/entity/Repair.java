package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Repair implements Serializable {
    private Long tbrId;

    private Long tbrHost;

    private Long tbrCar;

    private Byte tbrInsureType;

    private Byte tbrRepairType;

    private Long tbrAdr;

    private Long tbrOrder;

    private Date tbrInDate;

    private Date tbrOutDate;

    private String tbrDescript;

    private String tbrRepairNo;

    private Double tbrMoney;

    private Byte tbrIsSettle;

    private Date tbrSettleTime;

    private String tbrRemark;

    private Long tbrAdder;

    private Long tbrEditor;

    private Date tbrAddTime;

    private Date tbrUpdateTime;

    private Short tbrStatus;

    private static final long serialVersionUID = 1L;

    public Long getTbrId() {
        return tbrId;
    }

    public void setTbrId(Long tbrId) {
        this.tbrId = tbrId;
    }

    public Long getTbrHost() {
        return tbrHost;
    }

    public void setTbrHost(Long tbrHost) {
        this.tbrHost = tbrHost;
    }

    public Long getTbrCar() {
        return tbrCar;
    }

    public void setTbrCar(Long tbrCar) {
        this.tbrCar = tbrCar;
    }

    public Byte getTbrInsureType() {
        return tbrInsureType;
    }

    public void setTbrInsureType(Byte tbrInsureType) {
        this.tbrInsureType = tbrInsureType;
    }

    public Byte getTbrRepairType() {
        return tbrRepairType;
    }

    public void setTbrRepairType(Byte tbrRepairType) {
        this.tbrRepairType = tbrRepairType;
    }

    public Long getTbrAdr() {
        return tbrAdr;
    }

    public void setTbrAdr(Long tbrAdr) {
        this.tbrAdr = tbrAdr;
    }

    public Long getTbrOrder() {
        return tbrOrder;
    }

    public void setTbrOrder(Long tbrOrder) {
        this.tbrOrder = tbrOrder;
    }

    public Date getTbrInDate() {
        return tbrInDate;
    }

    public void setTbrInDate(Date tbrInDate) {
        this.tbrInDate = tbrInDate;
    }

    public Date getTbrOutDate() {
        return tbrOutDate;
    }

    public void setTbrOutDate(Date tbrOutDate) {
        this.tbrOutDate = tbrOutDate;
    }

    public String getTbrDescript() {
        return tbrDescript;
    }

    public void setTbrDescript(String tbrDescript) {
        this.tbrDescript = tbrDescript == null ? null : tbrDescript.trim();
    }

    public String getTbrRepairNo() {
        return tbrRepairNo;
    }

    public void setTbrRepairNo(String tbrRepairNo) {
        this.tbrRepairNo = tbrRepairNo == null ? null : tbrRepairNo.trim();
    }

    public Double getTbrMoney() {
        return tbrMoney;
    }

    public void setTbrMoney(Double tbrMoney) {
        this.tbrMoney = tbrMoney;
    }

    public Byte getTbrIsSettle() {
        return tbrIsSettle;
    }

    public void setTbrIsSettle(Byte tbrIsSettle) {
        this.tbrIsSettle = tbrIsSettle;
    }

    public Date getTbrSettleTime() {
        return tbrSettleTime;
    }

    public void setTbrSettleTime(Date tbrSettleTime) {
        this.tbrSettleTime = tbrSettleTime;
    }

    public String getTbrRemark() {
        return tbrRemark;
    }

    public void setTbrRemark(String tbrRemark) {
        this.tbrRemark = tbrRemark == null ? null : tbrRemark.trim();
    }

    public Long getTbrAdder() {
        return tbrAdder;
    }

    public void setTbrAdder(Long tbrAdder) {
        this.tbrAdder = tbrAdder;
    }

    public Long getTbrEditor() {
        return tbrEditor;
    }

    public void setTbrEditor(Long tbrEditor) {
        this.tbrEditor = tbrEditor;
    }

    public Date getTbrAddTime() {
        return tbrAddTime;
    }

    public void setTbrAddTime(Date tbrAddTime) {
        this.tbrAddTime = tbrAddTime;
    }

    public Date getTbrUpdateTime() {
        return tbrUpdateTime;
    }

    public void setTbrUpdateTime(Date tbrUpdateTime) {
        this.tbrUpdateTime = tbrUpdateTime;
    }

    public Short getTbrStatus() {
        return tbrStatus;
    }

    public void setTbrStatus(Short tbrStatus) {
        this.tbrStatus = tbrStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbrId=").append(tbrId);
        sb.append(", tbrHost=").append(tbrHost);
        sb.append(", tbrCar=").append(tbrCar);
        sb.append(", tbrInsureType=").append(tbrInsureType);
        sb.append(", tbrRepairType=").append(tbrRepairType);
        sb.append(", tbrAdr=").append(tbrAdr);
        sb.append(", tbrOrder=").append(tbrOrder);
        sb.append(", tbrInDate=").append(tbrInDate);
        sb.append(", tbrOutDate=").append(tbrOutDate);
        sb.append(", tbrDescript=").append(tbrDescript);
        sb.append(", tbrRepairNo=").append(tbrRepairNo);
        sb.append(", tbrMoney=").append(tbrMoney);
        sb.append(", tbrIsSettle=").append(tbrIsSettle);
        sb.append(", tbrSettleTime=").append(tbrSettleTime);
        sb.append(", tbrRemark=").append(tbrRemark);
        sb.append(", tbrAdder=").append(tbrAdder);
        sb.append(", tbrEditor=").append(tbrEditor);
        sb.append(", tbrAddTime=").append(tbrAddTime);
        sb.append(", tbrUpdateTime=").append(tbrUpdateTime);
        sb.append(", tbrStatus=").append(tbrStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}