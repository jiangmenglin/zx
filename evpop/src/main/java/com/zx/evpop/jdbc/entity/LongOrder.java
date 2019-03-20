package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class LongOrder implements Serializable {
    private Long tbloId;

    private Long tbloHost;

    private String tbloPackNo;

    private Long tbloMember;

    private Long tbloCar;

    private Date tbloStart;

    private Date tbloFinish;

    private Double tbloDeposit;

    private Double tbloFee;

    private Short tbloPayCycle;

    private Double tbloNeedPay;

    private Double tbloRealPay;

    private Date tbloPactTime;

    private Date tbloStartTime;

    private Date tbloFinishTime;

    private Date tbloUpdateTime;

    private Date tbloAddTime;

    private String tbloFlag;

    private String tbloTag;

    private String tbloSerial;

    private String tbloRemark;

    private Long tbloEditor;

    private String tbloError;

    private Short tbloStatus;

    private static final long serialVersionUID = 1L;

    public Long getTbloId() {
        return tbloId;
    }

    public void setTbloId(Long tbloId) {
        this.tbloId = tbloId;
    }

    public Long getTbloHost() {
        return tbloHost;
    }

    public void setTbloHost(Long tbloHost) {
        this.tbloHost = tbloHost;
    }

    public String getTbloPackNo() {
        return tbloPackNo;
    }

    public void setTbloPackNo(String tbloPackNo) {
        this.tbloPackNo = tbloPackNo == null ? null : tbloPackNo.trim();
    }

    public Long getTbloMember() {
        return tbloMember;
    }

    public void setTbloMember(Long tbloMember) {
        this.tbloMember = tbloMember;
    }

    public Long getTbloCar() {
        return tbloCar;
    }

    public void setTbloCar(Long tbloCar) {
        this.tbloCar = tbloCar;
    }

    public Date getTbloStart() {
        return tbloStart;
    }

    public void setTbloStart(Date tbloStart) {
        this.tbloStart = tbloStart;
    }

    public Date getTbloFinish() {
        return tbloFinish;
    }

    public void setTbloFinish(Date tbloFinish) {
        this.tbloFinish = tbloFinish;
    }

    public Double getTbloDeposit() {
        return tbloDeposit;
    }

    public void setTbloDeposit(Double tbloDeposit) {
        this.tbloDeposit = tbloDeposit;
    }

    public Double getTbloFee() {
        return tbloFee;
    }

    public void setTbloFee(Double tbloFee) {
        this.tbloFee = tbloFee;
    }

    public Short getTbloPayCycle() {
        return tbloPayCycle;
    }

    public void setTbloPayCycle(Short tbloPayCycle) {
        this.tbloPayCycle = tbloPayCycle;
    }

    public Double getTbloNeedPay() {
        return tbloNeedPay;
    }

    public void setTbloNeedPay(Double tbloNeedPay) {
        this.tbloNeedPay = tbloNeedPay;
    }

    public Double getTbloRealPay() {
        return tbloRealPay;
    }

    public void setTbloRealPay(Double tbloRealPay) {
        this.tbloRealPay = tbloRealPay;
    }

    public Date getTbloPactTime() {
        return tbloPactTime;
    }

    public void setTbloPactTime(Date tbloPactTime) {
        this.tbloPactTime = tbloPactTime;
    }

    public Date getTbloStartTime() {
        return tbloStartTime;
    }

    public void setTbloStartTime(Date tbloStartTime) {
        this.tbloStartTime = tbloStartTime;
    }

    public Date getTbloFinishTime() {
        return tbloFinishTime;
    }

    public void setTbloFinishTime(Date tbloFinishTime) {
        this.tbloFinishTime = tbloFinishTime;
    }

    public Date getTbloUpdateTime() {
        return tbloUpdateTime;
    }

    public void setTbloUpdateTime(Date tbloUpdateTime) {
        this.tbloUpdateTime = tbloUpdateTime;
    }

    public Date getTbloAddTime() {
        return tbloAddTime;
    }

    public void setTbloAddTime(Date tbloAddTime) {
        this.tbloAddTime = tbloAddTime;
    }

    public String getTbloFlag() {
        return tbloFlag;
    }

    public void setTbloFlag(String tbloFlag) {
        this.tbloFlag = tbloFlag == null ? null : tbloFlag.trim();
    }

    public String getTbloTag() {
        return tbloTag;
    }

    public void setTbloTag(String tbloTag) {
        this.tbloTag = tbloTag == null ? null : tbloTag.trim();
    }

    public String getTbloSerial() {
        return tbloSerial;
    }

    public void setTbloSerial(String tbloSerial) {
        this.tbloSerial = tbloSerial == null ? null : tbloSerial.trim();
    }

    public String getTbloRemark() {
        return tbloRemark;
    }

    public void setTbloRemark(String tbloRemark) {
        this.tbloRemark = tbloRemark == null ? null : tbloRemark.trim();
    }

    public Long getTbloEditor() {
        return tbloEditor;
    }

    public void setTbloEditor(Long tbloEditor) {
        this.tbloEditor = tbloEditor;
    }

    public String getTbloError() {
        return tbloError;
    }

    public void setTbloError(String tbloError) {
        this.tbloError = tbloError == null ? null : tbloError.trim();
    }

    public Short getTbloStatus() {
        return tbloStatus;
    }

    public void setTbloStatus(Short tbloStatus) {
        this.tbloStatus = tbloStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbloId=").append(tbloId);
        sb.append(", tbloHost=").append(tbloHost);
        sb.append(", tbloPackNo=").append(tbloPackNo);
        sb.append(", tbloMember=").append(tbloMember);
        sb.append(", tbloCar=").append(tbloCar);
        sb.append(", tbloStart=").append(tbloStart);
        sb.append(", tbloFinish=").append(tbloFinish);
        sb.append(", tbloDeposit=").append(tbloDeposit);
        sb.append(", tbloFee=").append(tbloFee);
        sb.append(", tbloPayCycle=").append(tbloPayCycle);
        sb.append(", tbloNeedPay=").append(tbloNeedPay);
        sb.append(", tbloRealPay=").append(tbloRealPay);
        sb.append(", tbloPactTime=").append(tbloPactTime);
        sb.append(", tbloStartTime=").append(tbloStartTime);
        sb.append(", tbloFinishTime=").append(tbloFinishTime);
        sb.append(", tbloUpdateTime=").append(tbloUpdateTime);
        sb.append(", tbloAddTime=").append(tbloAddTime);
        sb.append(", tbloFlag=").append(tbloFlag);
        sb.append(", tbloTag=").append(tbloTag);
        sb.append(", tbloSerial=").append(tbloSerial);
        sb.append(", tbloRemark=").append(tbloRemark);
        sb.append(", tbloEditor=").append(tbloEditor);
        sb.append(", tbloError=").append(tbloError);
        sb.append(", tbloStatus=").append(tbloStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}