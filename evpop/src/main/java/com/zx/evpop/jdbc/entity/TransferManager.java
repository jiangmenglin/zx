package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class TransferManager implements Serializable {
    private Long tbtmId;

    private Long tbtmHost;

    private Long tbtmOrderNo;

    private Long tbtmFaultCar;

    private String tbtmFault;

    private Date tbtmFailtGettime;

    private Date tbtmFreturnTime;

    private Long tbtmCar;

    private Date tbtmGetTime;

    private Date tbtmReturnTime;

    private Long tbtmName;

    private Long tbtmUser;

    private Date tbtmAddTime;

    private Long tbtmHandle;

    private Date tbtmUpdateTime;

    private Short tbtmStatus;

    private String tbtmText;

    private static final long serialVersionUID = 1L;

    public Long getTbtmId() {
        return tbtmId;
    }

    public void setTbtmId(Long tbtmId) {
        this.tbtmId = tbtmId;
    }

    public Long getTbtmHost() {
        return tbtmHost;
    }

    public void setTbtmHost(Long tbtmHost) {
        this.tbtmHost = tbtmHost;
    }

    public Long getTbtmOrderNo() {
        return tbtmOrderNo;
    }

    public void setTbtmOrderNo(Long tbtmOrderNo) {
        this.tbtmOrderNo = tbtmOrderNo;
    }

    public Long getTbtmFaultCar() {
        return tbtmFaultCar;
    }

    public void setTbtmFaultCar(Long tbtmFaultCar) {
        this.tbtmFaultCar = tbtmFaultCar;
    }

    public String getTbtmFault() {
        return tbtmFault;
    }

    public void setTbtmFault(String tbtmFault) {
        this.tbtmFault = tbtmFault == null ? null : tbtmFault.trim();
    }

    public Date getTbtmFailtGettime() {
        return tbtmFailtGettime;
    }

    public void setTbtmFailtGettime(Date tbtmFailtGettime) {
        this.tbtmFailtGettime = tbtmFailtGettime;
    }

    public Date getTbtmFreturnTime() {
        return tbtmFreturnTime;
    }

    public void setTbtmFreturnTime(Date tbtmFreturnTime) {
        this.tbtmFreturnTime = tbtmFreturnTime;
    }

    public Long getTbtmCar() {
        return tbtmCar;
    }

    public void setTbtmCar(Long tbtmCar) {
        this.tbtmCar = tbtmCar;
    }

    public Date getTbtmGetTime() {
        return tbtmGetTime;
    }

    public void setTbtmGetTime(Date tbtmGetTime) {
        this.tbtmGetTime = tbtmGetTime;
    }

    public Date getTbtmReturnTime() {
        return tbtmReturnTime;
    }

    public void setTbtmReturnTime(Date tbtmReturnTime) {
        this.tbtmReturnTime = tbtmReturnTime;
    }

    public Long getTbtmName() {
        return tbtmName;
    }

    public void setTbtmName(Long tbtmName) {
        this.tbtmName = tbtmName;
    }

    public Long getTbtmUser() {
        return tbtmUser;
    }

    public void setTbtmUser(Long tbtmUser) {
        this.tbtmUser = tbtmUser;
    }

    public Date getTbtmAddTime() {
        return tbtmAddTime;
    }

    public void setTbtmAddTime(Date tbtmAddTime) {
        this.tbtmAddTime = tbtmAddTime;
    }

    public Long getTbtmHandle() {
        return tbtmHandle;
    }

    public void setTbtmHandle(Long tbtmHandle) {
        this.tbtmHandle = tbtmHandle;
    }

    public Date getTbtmUpdateTime() {
        return tbtmUpdateTime;
    }

    public void setTbtmUpdateTime(Date tbtmUpdateTime) {
        this.tbtmUpdateTime = tbtmUpdateTime;
    }

    public Short getTbtmStatus() {
        return tbtmStatus;
    }

    public void setTbtmStatus(Short tbtmStatus) {
        this.tbtmStatus = tbtmStatus;
    }

    public String getTbtmText() {
        return tbtmText;
    }

    public void setTbtmText(String tbtmText) {
        this.tbtmText = tbtmText == null ? null : tbtmText.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbtmId=").append(tbtmId);
        sb.append(", tbtmHost=").append(tbtmHost);
        sb.append(", tbtmOrderNo=").append(tbtmOrderNo);
        sb.append(", tbtmFaultCar=").append(tbtmFaultCar);
        sb.append(", tbtmFault=").append(tbtmFault);
        sb.append(", tbtmFailtGettime=").append(tbtmFailtGettime);
        sb.append(", tbtmFreturnTime=").append(tbtmFreturnTime);
        sb.append(", tbtmCar=").append(tbtmCar);
        sb.append(", tbtmGetTime=").append(tbtmGetTime);
        sb.append(", tbtmReturnTime=").append(tbtmReturnTime);
        sb.append(", tbtmName=").append(tbtmName);
        sb.append(", tbtmUser=").append(tbtmUser);
        sb.append(", tbtmAddTime=").append(tbtmAddTime);
        sb.append(", tbtmHandle=").append(tbtmHandle);
        sb.append(", tbtmUpdateTime=").append(tbtmUpdateTime);
        sb.append(", tbtmStatus=").append(tbtmStatus);
        sb.append(", tbtmText=").append(tbtmText);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}