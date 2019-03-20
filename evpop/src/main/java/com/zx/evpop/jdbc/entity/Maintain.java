package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Maintain implements Serializable {
    private Long tbmId;

    private Long tbmHost;

    private Long tbmCar;

    private Long tbcModel;

    private String tbcVin;

    private Long tbmRepairSta;

    private Short tbmCurrType;

    private Short tbmType;

    private Short tbmExpectBy;

    private Date tbmExpectDate;

    private Date tbmDate;

    private Integer tbmExpectKm;

    private Integer tbmRealKm;

    private Integer tbmMileage;

    private String tbmCarstatus;

    private Integer tbmNextKm;

    private Date tbmNextDate;

    private Short tbmFeeType;

    private Double tbmFee;

    private String tbmBillNo;

    private String tbmRemark;

    private Date tbmAddTime;

    private Long tbmEditer;

    private Date tbmUpdatTime;

    private Short tbmStatus;

    private static final long serialVersionUID = 1L;

    public Long getTbmId() {
        return tbmId;
    }

    public void setTbmId(Long tbmId) {
        this.tbmId = tbmId;
    }

    public Long getTbmHost() {
        return tbmHost;
    }

    public void setTbmHost(Long tbmHost) {
        this.tbmHost = tbmHost;
    }

    public Long getTbmCar() {
        return tbmCar;
    }

    public void setTbmCar(Long tbmCar) {
        this.tbmCar = tbmCar;
    }

    public Long getTbcModel() {
        return tbcModel;
    }

    public void setTbcModel(Long tbcModel) {
        this.tbcModel = tbcModel;
    }

    public String getTbcVin() {
        return tbcVin;
    }

    public void setTbcVin(String tbcVin) {
        this.tbcVin = tbcVin == null ? null : tbcVin.trim();
    }

    public Long getTbmRepairSta() {
        return tbmRepairSta;
    }

    public void setTbmRepairSta(Long tbmRepairSta) {
        this.tbmRepairSta = tbmRepairSta;
    }

    public Short getTbmCurrType() {
        return tbmCurrType;
    }

    public void setTbmCurrType(Short tbmCurrType) {
        this.tbmCurrType = tbmCurrType;
    }

    public Short getTbmType() {
        return tbmType;
    }

    public void setTbmType(Short tbmType) {
        this.tbmType = tbmType;
    }

    public Short getTbmExpectBy() {
        return tbmExpectBy;
    }

    public void setTbmExpectBy(Short tbmExpectBy) {
        this.tbmExpectBy = tbmExpectBy;
    }

    public Date getTbmExpectDate() {
        return tbmExpectDate;
    }

    public void setTbmExpectDate(Date tbmExpectDate) {
        this.tbmExpectDate = tbmExpectDate;
    }

    public Date getTbmDate() {
        return tbmDate;
    }

    public void setTbmDate(Date tbmDate) {
        this.tbmDate = tbmDate;
    }

    public Integer getTbmExpectKm() {
        return tbmExpectKm;
    }

    public void setTbmExpectKm(Integer tbmExpectKm) {
        this.tbmExpectKm = tbmExpectKm;
    }

    public Integer getTbmRealKm() {
        return tbmRealKm;
    }

    public void setTbmRealKm(Integer tbmRealKm) {
        this.tbmRealKm = tbmRealKm;
    }

    public Integer getTbmMileage() {
        return tbmMileage;
    }

    public void setTbmMileage(Integer tbmMileage) {
        this.tbmMileage = tbmMileage;
    }

    public String getTbmCarstatus() {
        return tbmCarstatus;
    }

    public void setTbmCarstatus(String tbmCarstatus) {
        this.tbmCarstatus = tbmCarstatus == null ? null : tbmCarstatus.trim();
    }

    public Integer getTbmNextKm() {
        return tbmNextKm;
    }

    public void setTbmNextKm(Integer tbmNextKm) {
        this.tbmNextKm = tbmNextKm;
    }

    public Date getTbmNextDate() {
        return tbmNextDate;
    }

    public void setTbmNextDate(Date tbmNextDate) {
        this.tbmNextDate = tbmNextDate;
    }

    public Short getTbmFeeType() {
        return tbmFeeType;
    }

    public void setTbmFeeType(Short tbmFeeType) {
        this.tbmFeeType = tbmFeeType;
    }

    public Double getTbmFee() {
        return tbmFee;
    }

    public void setTbmFee(Double tbmFee) {
        this.tbmFee = tbmFee;
    }

    public String getTbmBillNo() {
        return tbmBillNo;
    }

    public void setTbmBillNo(String tbmBillNo) {
        this.tbmBillNo = tbmBillNo == null ? null : tbmBillNo.trim();
    }

    public String getTbmRemark() {
        return tbmRemark;
    }

    public void setTbmRemark(String tbmRemark) {
        this.tbmRemark = tbmRemark == null ? null : tbmRemark.trim();
    }

    public Date getTbmAddTime() {
        return tbmAddTime;
    }

    public void setTbmAddTime(Date tbmAddTime) {
        this.tbmAddTime = tbmAddTime;
    }

    public Long getTbmEditer() {
        return tbmEditer;
    }

    public void setTbmEditer(Long tbmEditer) {
        this.tbmEditer = tbmEditer;
    }

    public Date getTbmUpdatTime() {
        return tbmUpdatTime;
    }

    public void setTbmUpdatTime(Date tbmUpdatTime) {
        this.tbmUpdatTime = tbmUpdatTime;
    }

    public Short getTbmStatus() {
        return tbmStatus;
    }

    public void setTbmStatus(Short tbmStatus) {
        this.tbmStatus = tbmStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbmId=").append(tbmId);
        sb.append(", tbmHost=").append(tbmHost);
        sb.append(", tbmCar=").append(tbmCar);
        sb.append(", tbcModel=").append(tbcModel);
        sb.append(", tbcVin=").append(tbcVin);
        sb.append(", tbmRepairSta=").append(tbmRepairSta);
        sb.append(", tbmCurrType=").append(tbmCurrType);
        sb.append(", tbmType=").append(tbmType);
        sb.append(", tbmExpectBy=").append(tbmExpectBy);
        sb.append(", tbmExpectDate=").append(tbmExpectDate);
        sb.append(", tbmDate=").append(tbmDate);
        sb.append(", tbmExpectKm=").append(tbmExpectKm);
        sb.append(", tbmRealKm=").append(tbmRealKm);
        sb.append(", tbmMileage=").append(tbmMileage);
        sb.append(", tbmCarstatus=").append(tbmCarstatus);
        sb.append(", tbmNextKm=").append(tbmNextKm);
        sb.append(", tbmNextDate=").append(tbmNextDate);
        sb.append(", tbmFeeType=").append(tbmFeeType);
        sb.append(", tbmFee=").append(tbmFee);
        sb.append(", tbmBillNo=").append(tbmBillNo);
        sb.append(", tbmRemark=").append(tbmRemark);
        sb.append(", tbmAddTime=").append(tbmAddTime);
        sb.append(", tbmEditer=").append(tbmEditer);
        sb.append(", tbmUpdatTime=").append(tbmUpdatTime);
        sb.append(", tbmStatus=").append(tbmStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}