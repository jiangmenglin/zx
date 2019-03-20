package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class MaintainRecord implements Serializable {
    private Long tbmrId;

    private Long tbmrMaintain;

    private Long tbmrCar;

    private Short tbmrType;

    private Long tbmrRepairAdr;

    private Short tbmrFeeType;

    private Double tbmrFee;

    private String tbmrBillNo;

    private Integer tbmrRealKm;

    private Long tbmrAdder;

    private Date tbmrAddTime;

    private Short tbmrStatus;

    private static final long serialVersionUID = 1L;

    public Long getTbmrId() {
        return tbmrId;
    }

    public void setTbmrId(Long tbmrId) {
        this.tbmrId = tbmrId;
    }

    public Long getTbmrMaintain() {
        return tbmrMaintain;
    }

    public void setTbmrMaintain(Long tbmrMaintain) {
        this.tbmrMaintain = tbmrMaintain;
    }

    public Long getTbmrCar() {
        return tbmrCar;
    }

    public void setTbmrCar(Long tbmrCar) {
        this.tbmrCar = tbmrCar;
    }

    public Short getTbmrType() {
        return tbmrType;
    }

    public void setTbmrType(Short tbmrType) {
        this.tbmrType = tbmrType;
    }

    public Long getTbmrRepairAdr() {
        return tbmrRepairAdr;
    }

    public void setTbmrRepairAdr(Long tbmrRepairAdr) {
        this.tbmrRepairAdr = tbmrRepairAdr;
    }

    public Short getTbmrFeeType() {
        return tbmrFeeType;
    }

    public void setTbmrFeeType(Short tbmrFeeType) {
        this.tbmrFeeType = tbmrFeeType;
    }

    public Double getTbmrFee() {
        return tbmrFee;
    }

    public void setTbmrFee(Double tbmrFee) {
        this.tbmrFee = tbmrFee;
    }

    public String getTbmrBillNo() {
        return tbmrBillNo;
    }

    public void setTbmrBillNo(String tbmrBillNo) {
        this.tbmrBillNo = tbmrBillNo == null ? null : tbmrBillNo.trim();
    }

    public Integer getTbmrRealKm() {
        return tbmrRealKm;
    }

    public void setTbmrRealKm(Integer tbmrRealKm) {
        this.tbmrRealKm = tbmrRealKm;
    }

    public Long getTbmrAdder() {
        return tbmrAdder;
    }

    public void setTbmrAdder(Long tbmrAdder) {
        this.tbmrAdder = tbmrAdder;
    }

    public Date getTbmrAddTime() {
        return tbmrAddTime;
    }

    public void setTbmrAddTime(Date tbmrAddTime) {
        this.tbmrAddTime = tbmrAddTime;
    }

    public Short getTbmrStatus() {
        return tbmrStatus;
    }

    public void setTbmrStatus(Short tbmrStatus) {
        this.tbmrStatus = tbmrStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbmrId=").append(tbmrId);
        sb.append(", tbmrMaintain=").append(tbmrMaintain);
        sb.append(", tbmrCar=").append(tbmrCar);
        sb.append(", tbmrType=").append(tbmrType);
        sb.append(", tbmrRepairAdr=").append(tbmrRepairAdr);
        sb.append(", tbmrFeeType=").append(tbmrFeeType);
        sb.append(", tbmrFee=").append(tbmrFee);
        sb.append(", tbmrBillNo=").append(tbmrBillNo);
        sb.append(", tbmrRealKm=").append(tbmrRealKm);
        sb.append(", tbmrAdder=").append(tbmrAdder);
        sb.append(", tbmrAddTime=").append(tbmrAddTime);
        sb.append(", tbmrStatus=").append(tbmrStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}