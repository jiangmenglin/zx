package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class CodeScanRecord implements Serializable {
    private Long tbcsrId;

    private Long tbcsrMember;

    private Long tbcsrCoupon;

    private Long tbcsrCouponType;

    private Long tbcsrCodeScanConfig;

    private Long tbcsrUnitChannel;

    private Long tbcsrUnitPartner;

    private Double tbcsrCouponAmount;

    private Double tbcsrCouponAmountAll;

    private Short tbcsrCodeSource;

    private String tbcsrCode;

    private Short tbcsrCodeState;

    private Date tbcsrCodeTime;

    private String tbcsrRemark;

    private Date tbcsrUpdateTime;

    private Date tbcsrAddTime;

    private Short tbcsrStatus;

    private static final long serialVersionUID = 1L;

    public Long getTbcsrId() {
        return tbcsrId;
    }

    public void setTbcsrId(Long tbcsrId) {
        this.tbcsrId = tbcsrId;
    }

    public Long getTbcsrMember() {
        return tbcsrMember;
    }

    public void setTbcsrMember(Long tbcsrMember) {
        this.tbcsrMember = tbcsrMember;
    }

    public Long getTbcsrCoupon() {
        return tbcsrCoupon;
    }

    public void setTbcsrCoupon(Long tbcsrCoupon) {
        this.tbcsrCoupon = tbcsrCoupon;
    }

    public Long getTbcsrCouponType() {
        return tbcsrCouponType;
    }

    public void setTbcsrCouponType(Long tbcsrCouponType) {
        this.tbcsrCouponType = tbcsrCouponType;
    }

    public Long getTbcsrCodeScanConfig() {
        return tbcsrCodeScanConfig;
    }

    public void setTbcsrCodeScanConfig(Long tbcsrCodeScanConfig) {
        this.tbcsrCodeScanConfig = tbcsrCodeScanConfig;
    }

    public Long getTbcsrUnitChannel() {
        return tbcsrUnitChannel;
    }

    public void setTbcsrUnitChannel(Long tbcsrUnitChannel) {
        this.tbcsrUnitChannel = tbcsrUnitChannel;
    }

    public Long getTbcsrUnitPartner() {
        return tbcsrUnitPartner;
    }

    public void setTbcsrUnitPartner(Long tbcsrUnitPartner) {
        this.tbcsrUnitPartner = tbcsrUnitPartner;
    }

    public Double getTbcsrCouponAmount() {
        return tbcsrCouponAmount;
    }

    public void setTbcsrCouponAmount(Double tbcsrCouponAmount) {
        this.tbcsrCouponAmount = tbcsrCouponAmount;
    }

    public Double getTbcsrCouponAmountAll() {
        return tbcsrCouponAmountAll;
    }

    public void setTbcsrCouponAmountAll(Double tbcsrCouponAmountAll) {
        this.tbcsrCouponAmountAll = tbcsrCouponAmountAll;
    }

    public Short getTbcsrCodeSource() {
        return tbcsrCodeSource;
    }

    public void setTbcsrCodeSource(Short tbcsrCodeSource) {
        this.tbcsrCodeSource = tbcsrCodeSource;
    }

    public String getTbcsrCode() {
        return tbcsrCode;
    }

    public void setTbcsrCode(String tbcsrCode) {
        this.tbcsrCode = tbcsrCode == null ? null : tbcsrCode.trim();
    }

    public Short getTbcsrCodeState() {
        return tbcsrCodeState;
    }

    public void setTbcsrCodeState(Short tbcsrCodeState) {
        this.tbcsrCodeState = tbcsrCodeState;
    }

    public Date getTbcsrCodeTime() {
        return tbcsrCodeTime;
    }

    public void setTbcsrCodeTime(Date tbcsrCodeTime) {
        this.tbcsrCodeTime = tbcsrCodeTime;
    }

    public String getTbcsrRemark() {
        return tbcsrRemark;
    }

    public void setTbcsrRemark(String tbcsrRemark) {
        this.tbcsrRemark = tbcsrRemark == null ? null : tbcsrRemark.trim();
    }

    public Date getTbcsrUpdateTime() {
        return tbcsrUpdateTime;
    }

    public void setTbcsrUpdateTime(Date tbcsrUpdateTime) {
        this.tbcsrUpdateTime = tbcsrUpdateTime;
    }

    public Date getTbcsrAddTime() {
        return tbcsrAddTime;
    }

    public void setTbcsrAddTime(Date tbcsrAddTime) {
        this.tbcsrAddTime = tbcsrAddTime;
    }

    public Short getTbcsrStatus() {
        return tbcsrStatus;
    }

    public void setTbcsrStatus(Short tbcsrStatus) {
        this.tbcsrStatus = tbcsrStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbcsrId=").append(tbcsrId);
        sb.append(", tbcsrMember=").append(tbcsrMember);
        sb.append(", tbcsrCoupon=").append(tbcsrCoupon);
        sb.append(", tbcsrCouponType=").append(tbcsrCouponType);
        sb.append(", tbcsrCodeScanConfig=").append(tbcsrCodeScanConfig);
        sb.append(", tbcsrUnitChannel=").append(tbcsrUnitChannel);
        sb.append(", tbcsrUnitPartner=").append(tbcsrUnitPartner);
        sb.append(", tbcsrCouponAmount=").append(tbcsrCouponAmount);
        sb.append(", tbcsrCouponAmountAll=").append(tbcsrCouponAmountAll);
        sb.append(", tbcsrCodeSource=").append(tbcsrCodeSource);
        sb.append(", tbcsrCode=").append(tbcsrCode);
        sb.append(", tbcsrCodeState=").append(tbcsrCodeState);
        sb.append(", tbcsrCodeTime=").append(tbcsrCodeTime);
        sb.append(", tbcsrRemark=").append(tbcsrRemark);
        sb.append(", tbcsrUpdateTime=").append(tbcsrUpdateTime);
        sb.append(", tbcsrAddTime=").append(tbcsrAddTime);
        sb.append(", tbcsrStatus=").append(tbcsrStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}