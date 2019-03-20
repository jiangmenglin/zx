package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class OperOrder implements Serializable {
    private Long tbooId;

    private Long tbooHost;

    private Long tbooUser;

    private Long tbooArea;

    private Long tbooOutletsFrom;

    private Long tbooOutletsTo;

    private Long tbooCar;

    private Short tbooType;

    private Date tbooStartTime;

    private Date tbooFinishTime;

    private Date tbooTakeTime;

    private Date tbooRetTime;

    private Date tbooBeginTime;

    private Date tbooEndTime;

    private Double tbooDuration;

    private Date tbooUpdateTime;

    private Date tbooAddTime;

    private String tbooCode;

    private String tbooRemark;

    private String tbooLog;

    private Long tbooEditor;

    private Short tbooState;

    private Short tbooStatus;

    private static final long serialVersionUID = 1L;

    public Long getTbooId() {
        return tbooId;
    }

    public void setTbooId(Long tbooId) {
        this.tbooId = tbooId;
    }

    public Long getTbooHost() {
        return tbooHost;
    }

    public void setTbooHost(Long tbooHost) {
        this.tbooHost = tbooHost;
    }

    public Long getTbooUser() {
        return tbooUser;
    }

    public void setTbooUser(Long tbooUser) {
        this.tbooUser = tbooUser;
    }

    public Long getTbooArea() {
        return tbooArea;
    }

    public void setTbooArea(Long tbooArea) {
        this.tbooArea = tbooArea;
    }

    public Long getTbooOutletsFrom() {
        return tbooOutletsFrom;
    }

    public void setTbooOutletsFrom(Long tbooOutletsFrom) {
        this.tbooOutletsFrom = tbooOutletsFrom;
    }

    public Long getTbooOutletsTo() {
        return tbooOutletsTo;
    }

    public void setTbooOutletsTo(Long tbooOutletsTo) {
        this.tbooOutletsTo = tbooOutletsTo;
    }

    public Long getTbooCar() {
        return tbooCar;
    }

    public void setTbooCar(Long tbooCar) {
        this.tbooCar = tbooCar;
    }

    public Short getTbooType() {
        return tbooType;
    }

    public void setTbooType(Short tbooType) {
        this.tbooType = tbooType;
    }

    public Date getTbooStartTime() {
        return tbooStartTime;
    }

    public void setTbooStartTime(Date tbooStartTime) {
        this.tbooStartTime = tbooStartTime;
    }

    public Date getTbooFinishTime() {
        return tbooFinishTime;
    }

    public void setTbooFinishTime(Date tbooFinishTime) {
        this.tbooFinishTime = tbooFinishTime;
    }

    public Date getTbooTakeTime() {
        return tbooTakeTime;
    }

    public void setTbooTakeTime(Date tbooTakeTime) {
        this.tbooTakeTime = tbooTakeTime;
    }

    public Date getTbooRetTime() {
        return tbooRetTime;
    }

    public void setTbooRetTime(Date tbooRetTime) {
        this.tbooRetTime = tbooRetTime;
    }

    public Date getTbooBeginTime() {
        return tbooBeginTime;
    }

    public void setTbooBeginTime(Date tbooBeginTime) {
        this.tbooBeginTime = tbooBeginTime;
    }

    public Date getTbooEndTime() {
        return tbooEndTime;
    }

    public void setTbooEndTime(Date tbooEndTime) {
        this.tbooEndTime = tbooEndTime;
    }

    public Double getTbooDuration() {
        return tbooDuration;
    }

    public void setTbooDuration(Double tbooDuration) {
        this.tbooDuration = tbooDuration;
    }

    public Date getTbooUpdateTime() {
        return tbooUpdateTime;
    }

    public void setTbooUpdateTime(Date tbooUpdateTime) {
        this.tbooUpdateTime = tbooUpdateTime;
    }

    public Date getTbooAddTime() {
        return tbooAddTime;
    }

    public void setTbooAddTime(Date tbooAddTime) {
        this.tbooAddTime = tbooAddTime;
    }

    public String getTbooCode() {
        return tbooCode;
    }

    public void setTbooCode(String tbooCode) {
        this.tbooCode = tbooCode == null ? null : tbooCode.trim();
    }

    public String getTbooRemark() {
        return tbooRemark;
    }

    public void setTbooRemark(String tbooRemark) {
        this.tbooRemark = tbooRemark == null ? null : tbooRemark.trim();
    }

    public String getTbooLog() {
        return tbooLog;
    }

    public void setTbooLog(String tbooLog) {
        this.tbooLog = tbooLog == null ? null : tbooLog.trim();
    }

    public Long getTbooEditor() {
        return tbooEditor;
    }

    public void setTbooEditor(Long tbooEditor) {
        this.tbooEditor = tbooEditor;
    }

    public Short getTbooState() {
        return tbooState;
    }

    public void setTbooState(Short tbooState) {
        this.tbooState = tbooState;
    }

    public Short getTbooStatus() {
        return tbooStatus;
    }

    public void setTbooStatus(Short tbooStatus) {
        this.tbooStatus = tbooStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbooId=").append(tbooId);
        sb.append(", tbooHost=").append(tbooHost);
        sb.append(", tbooUser=").append(tbooUser);
        sb.append(", tbooArea=").append(tbooArea);
        sb.append(", tbooOutletsFrom=").append(tbooOutletsFrom);
        sb.append(", tbooOutletsTo=").append(tbooOutletsTo);
        sb.append(", tbooCar=").append(tbooCar);
        sb.append(", tbooType=").append(tbooType);
        sb.append(", tbooStartTime=").append(tbooStartTime);
        sb.append(", tbooFinishTime=").append(tbooFinishTime);
        sb.append(", tbooTakeTime=").append(tbooTakeTime);
        sb.append(", tbooRetTime=").append(tbooRetTime);
        sb.append(", tbooBeginTime=").append(tbooBeginTime);
        sb.append(", tbooEndTime=").append(tbooEndTime);
        sb.append(", tbooDuration=").append(tbooDuration);
        sb.append(", tbooUpdateTime=").append(tbooUpdateTime);
        sb.append(", tbooAddTime=").append(tbooAddTime);
        sb.append(", tbooCode=").append(tbooCode);
        sb.append(", tbooRemark=").append(tbooRemark);
        sb.append(", tbooLog=").append(tbooLog);
        sb.append(", tbooEditor=").append(tbooEditor);
        sb.append(", tbooState=").append(tbooState);
        sb.append(", tbooStatus=").append(tbooStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}