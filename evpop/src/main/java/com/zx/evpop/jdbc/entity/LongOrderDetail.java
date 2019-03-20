package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class LongOrderDetail implements Serializable {
    private Long tblodId;

    private Long tblodHost;

    private Long tblodLongOrder;

    private Long tblodCar;

    private Double tblodPrice;

    private Long tblodSetKilo;

    private Long tblodRetKilo;

    private Date tblodSetTime;

    private Date tblodRetTime;

    private Date tblodUpdateTime;

    private Date tblodAddTime;

    private Long tblodEditor;

    private String tblodRemark;

    private Short tblodStatus;

    private static final long serialVersionUID = 1L;

    public Long getTblodId() {
        return tblodId;
    }

    public void setTblodId(Long tblodId) {
        this.tblodId = tblodId;
    }

    public Long getTblodHost() {
        return tblodHost;
    }

    public void setTblodHost(Long tblodHost) {
        this.tblodHost = tblodHost;
    }

    public Long getTblodLongOrder() {
        return tblodLongOrder;
    }

    public void setTblodLongOrder(Long tblodLongOrder) {
        this.tblodLongOrder = tblodLongOrder;
    }

    public Long getTblodCar() {
        return tblodCar;
    }

    public void setTblodCar(Long tblodCar) {
        this.tblodCar = tblodCar;
    }

    public Double getTblodPrice() {
        return tblodPrice;
    }

    public void setTblodPrice(Double tblodPrice) {
        this.tblodPrice = tblodPrice;
    }

    public Long getTblodSetKilo() {
        return tblodSetKilo;
    }

    public void setTblodSetKilo(Long tblodSetKilo) {
        this.tblodSetKilo = tblodSetKilo;
    }

    public Long getTblodRetKilo() {
        return tblodRetKilo;
    }

    public void setTblodRetKilo(Long tblodRetKilo) {
        this.tblodRetKilo = tblodRetKilo;
    }

    public Date getTblodSetTime() {
        return tblodSetTime;
    }

    public void setTblodSetTime(Date tblodSetTime) {
        this.tblodSetTime = tblodSetTime;
    }

    public Date getTblodRetTime() {
        return tblodRetTime;
    }

    public void setTblodRetTime(Date tblodRetTime) {
        this.tblodRetTime = tblodRetTime;
    }

    public Date getTblodUpdateTime() {
        return tblodUpdateTime;
    }

    public void setTblodUpdateTime(Date tblodUpdateTime) {
        this.tblodUpdateTime = tblodUpdateTime;
    }

    public Date getTblodAddTime() {
        return tblodAddTime;
    }

    public void setTblodAddTime(Date tblodAddTime) {
        this.tblodAddTime = tblodAddTime;
    }

    public Long getTblodEditor() {
        return tblodEditor;
    }

    public void setTblodEditor(Long tblodEditor) {
        this.tblodEditor = tblodEditor;
    }

    public String getTblodRemark() {
        return tblodRemark;
    }

    public void setTblodRemark(String tblodRemark) {
        this.tblodRemark = tblodRemark == null ? null : tblodRemark.trim();
    }

    public Short getTblodStatus() {
        return tblodStatus;
    }

    public void setTblodStatus(Short tblodStatus) {
        this.tblodStatus = tblodStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tblodId=").append(tblodId);
        sb.append(", tblodHost=").append(tblodHost);
        sb.append(", tblodLongOrder=").append(tblodLongOrder);
        sb.append(", tblodCar=").append(tblodCar);
        sb.append(", tblodPrice=").append(tblodPrice);
        sb.append(", tblodSetKilo=").append(tblodSetKilo);
        sb.append(", tblodRetKilo=").append(tblodRetKilo);
        sb.append(", tblodSetTime=").append(tblodSetTime);
        sb.append(", tblodRetTime=").append(tblodRetTime);
        sb.append(", tblodUpdateTime=").append(tblodUpdateTime);
        sb.append(", tblodAddTime=").append(tblodAddTime);
        sb.append(", tblodEditor=").append(tblodEditor);
        sb.append(", tblodRemark=").append(tblodRemark);
        sb.append(", tblodStatus=").append(tblodStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}