package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Coupon implements Serializable {
    private Integer tbcId;

    private Short tbcHost;

    private String tbcTitle;

    private Integer tbcMember;

    private Byte tbcLimit;

    private BigDecimal tbcMin;

    private Integer tbcType;

    private String tbcFlag;

    private Double tbcCount;

    private Byte tbcValidity;

    private Date tbcBegin;

    private Date tbcEnd;

    private Date tbcUseTime;

    private String tbcSerial;

    private Long tbcOrder;

    private Long tbcLongOrder;

    private String tbcData;

    private Integer tbcEditor;

    private Date tbcUpdateTime;

    private Date tbcAddTime;

    private String tbcRemark;

    private Byte tbcTimeout;

    private Byte tbcUsed;

    private Byte tbcStatus;

    private static final long serialVersionUID = 1L;

    public Integer getTbcId() {
        return tbcId;
    }

    public void setTbcId(Integer tbcId) {
        this.tbcId = tbcId;
    }

    public Short getTbcHost() {
        return tbcHost;
    }

    public void setTbcHost(Short tbcHost) {
        this.tbcHost = tbcHost;
    }

    public String getTbcTitle() {
        return tbcTitle;
    }

    public void setTbcTitle(String tbcTitle) {
        this.tbcTitle = tbcTitle == null ? null : tbcTitle.trim();
    }

    public Integer getTbcMember() {
        return tbcMember;
    }

    public void setTbcMember(Integer tbcMember) {
        this.tbcMember = tbcMember;
    }

    public Byte getTbcLimit() {
        return tbcLimit;
    }

    public void setTbcLimit(Byte tbcLimit) {
        this.tbcLimit = tbcLimit;
    }

    public BigDecimal getTbcMin() {
        return tbcMin;
    }

    public void setTbcMin(BigDecimal tbcMin) {
        this.tbcMin = tbcMin;
    }

    public Integer getTbcType() {
        return tbcType;
    }

    public void setTbcType(Integer tbcType) {
        this.tbcType = tbcType;
    }

    public String getTbcFlag() {
        return tbcFlag;
    }

    public void setTbcFlag(String tbcFlag) {
        this.tbcFlag = tbcFlag == null ? null : tbcFlag.trim();
    }

    public Double getTbcCount() {
        return tbcCount;
    }

    public void setTbcCount(Double tbcCount) {
        this.tbcCount = tbcCount;
    }

    public Byte getTbcValidity() {
        return tbcValidity;
    }

    public void setTbcValidity(Byte tbcValidity) {
        this.tbcValidity = tbcValidity;
    }

    public Date getTbcBegin() {
        return tbcBegin;
    }

    public void setTbcBegin(Date tbcBegin) {
        this.tbcBegin = tbcBegin;
    }

    public Date getTbcEnd() {
        return tbcEnd;
    }

    public void setTbcEnd(Date tbcEnd) {
        this.tbcEnd = tbcEnd;
    }

    public Date getTbcUseTime() {
        return tbcUseTime;
    }

    public void setTbcUseTime(Date tbcUseTime) {
        this.tbcUseTime = tbcUseTime;
    }

    public String getTbcSerial() {
        return tbcSerial;
    }

    public void setTbcSerial(String tbcSerial) {
        this.tbcSerial = tbcSerial == null ? null : tbcSerial.trim();
    }

    public Long getTbcOrder() {
        return tbcOrder;
    }

    public void setTbcOrder(Long tbcOrder) {
        this.tbcOrder = tbcOrder;
    }

    public Long getTbcLongOrder() {
        return tbcLongOrder;
    }

    public void setTbcLongOrder(Long tbcLongOrder) {
        this.tbcLongOrder = tbcLongOrder;
    }

    public String getTbcData() {
        return tbcData;
    }

    public void setTbcData(String tbcData) {
        this.tbcData = tbcData == null ? null : tbcData.trim();
    }

    public Integer getTbcEditor() {
        return tbcEditor;
    }

    public void setTbcEditor(Integer tbcEditor) {
        this.tbcEditor = tbcEditor;
    }

    public Date getTbcUpdateTime() {
        return tbcUpdateTime;
    }

    public void setTbcUpdateTime(Date tbcUpdateTime) {
        this.tbcUpdateTime = tbcUpdateTime;
    }

    public Date getTbcAddTime() {
        return tbcAddTime;
    }

    public void setTbcAddTime(Date tbcAddTime) {
        this.tbcAddTime = tbcAddTime;
    }

    public String getTbcRemark() {
        return tbcRemark;
    }

    public void setTbcRemark(String tbcRemark) {
        this.tbcRemark = tbcRemark == null ? null : tbcRemark.trim();
    }

    public Byte getTbcTimeout() {
        return tbcTimeout;
    }

    public void setTbcTimeout(Byte tbcTimeout) {
        this.tbcTimeout = tbcTimeout;
    }

    public Byte getTbcUsed() {
        return tbcUsed;
    }

    public void setTbcUsed(Byte tbcUsed) {
        this.tbcUsed = tbcUsed;
    }

    public Byte getTbcStatus() {
        return tbcStatus;
    }

    public void setTbcStatus(Byte tbcStatus) {
        this.tbcStatus = tbcStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbcId=").append(tbcId);
        sb.append(", tbcHost=").append(tbcHost);
        sb.append(", tbcTitle=").append(tbcTitle);
        sb.append(", tbcMember=").append(tbcMember);
        sb.append(", tbcLimit=").append(tbcLimit);
        sb.append(", tbcMin=").append(tbcMin);
        sb.append(", tbcType=").append(tbcType);
        sb.append(", tbcFlag=").append(tbcFlag);
        sb.append(", tbcCount=").append(tbcCount);
        sb.append(", tbcValidity=").append(tbcValidity);
        sb.append(", tbcBegin=").append(tbcBegin);
        sb.append(", tbcEnd=").append(tbcEnd);
        sb.append(", tbcUseTime=").append(tbcUseTime);
        sb.append(", tbcSerial=").append(tbcSerial);
        sb.append(", tbcOrder=").append(tbcOrder);
        sb.append(", tbcLongOrder=").append(tbcLongOrder);
        sb.append(", tbcData=").append(tbcData);
        sb.append(", tbcEditor=").append(tbcEditor);
        sb.append(", tbcUpdateTime=").append(tbcUpdateTime);
        sb.append(", tbcAddTime=").append(tbcAddTime);
        sb.append(", tbcRemark=").append(tbcRemark);
        sb.append(", tbcTimeout=").append(tbcTimeout);
        sb.append(", tbcUsed=").append(tbcUsed);
        sb.append(", tbcStatus=").append(tbcStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}