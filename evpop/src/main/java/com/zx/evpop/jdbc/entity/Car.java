package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Car implements Serializable {
    private Integer tbcId;

    private Short tbcHost;

    private String tbcVin;

    private String tbcCarNo;

    private String tbcNumber;

    private Integer tbcVehicle;

    private Integer tbcProvid;

    private Integer tbcModel;

    private Long tbcArea;

    private Integer tbcOutlets;

    private String tbcEngine;

    private String tbcColor;

    private BigDecimal tbcLat;

    private BigDecimal tbcLng;

    private Integer tbcEditor;

    private String tbcRemark;

    private String tbcCondition;

    private String tbcReason;

    private Date tbcUpdateTime;

    private Date tbcAddTime;

    private Byte tbcState;

    private Byte tbcStatusEx;

    private Byte tbcStatus;

    private Date createtime;

    private Date modifydate;

    private String tbcDriving;

    private Short tbcNoday;

    private Integer tbcYntask;

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

    public String getTbcVin() {
        return tbcVin;
    }

    public void setTbcVin(String tbcVin) {
        this.tbcVin = tbcVin == null ? null : tbcVin.trim();
    }

    public String getTbcCarNo() {
        return tbcCarNo;
    }

    public void setTbcCarNo(String tbcCarNo) {
        this.tbcCarNo = tbcCarNo == null ? null : tbcCarNo.trim();
    }

    public String getTbcNumber() {
        return tbcNumber;
    }

    public void setTbcNumber(String tbcNumber) {
        this.tbcNumber = tbcNumber == null ? null : tbcNumber.trim();
    }

    public Integer getTbcVehicle() {
        return tbcVehicle;
    }

    public void setTbcVehicle(Integer tbcVehicle) {
        this.tbcVehicle = tbcVehicle;
    }

    public Integer getTbcProvid() {
        return tbcProvid;
    }

    public void setTbcProvid(Integer tbcProvid) {
        this.tbcProvid = tbcProvid;
    }

    public Integer getTbcModel() {
        return tbcModel;
    }

    public void setTbcModel(Integer tbcModel) {
        this.tbcModel = tbcModel;
    }

    public Long getTbcArea() {
        return tbcArea;
    }

    public void setTbcArea(Long tbcArea) {
        this.tbcArea = tbcArea;
    }

    public Integer getTbcOutlets() {
        return tbcOutlets;
    }

    public void setTbcOutlets(Integer tbcOutlets) {
        this.tbcOutlets = tbcOutlets;
    }

    public String getTbcEngine() {
        return tbcEngine;
    }

    public void setTbcEngine(String tbcEngine) {
        this.tbcEngine = tbcEngine == null ? null : tbcEngine.trim();
    }

    public String getTbcColor() {
        return tbcColor;
    }

    public void setTbcColor(String tbcColor) {
        this.tbcColor = tbcColor == null ? null : tbcColor.trim();
    }

    public BigDecimal getTbcLat() {
        return tbcLat;
    }

    public void setTbcLat(BigDecimal tbcLat) {
        this.tbcLat = tbcLat;
    }

    public BigDecimal getTbcLng() {
        return tbcLng;
    }

    public void setTbcLng(BigDecimal tbcLng) {
        this.tbcLng = tbcLng;
    }

    public Integer getTbcEditor() {
        return tbcEditor;
    }

    public void setTbcEditor(Integer tbcEditor) {
        this.tbcEditor = tbcEditor;
    }

    public String getTbcRemark() {
        return tbcRemark;
    }

    public void setTbcRemark(String tbcRemark) {
        this.tbcRemark = tbcRemark == null ? null : tbcRemark.trim();
    }

    public String getTbcCondition() {
        return tbcCondition;
    }

    public void setTbcCondition(String tbcCondition) {
        this.tbcCondition = tbcCondition == null ? null : tbcCondition.trim();
    }

    public String getTbcReason() {
        return tbcReason;
    }

    public void setTbcReason(String tbcReason) {
        this.tbcReason = tbcReason == null ? null : tbcReason.trim();
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

    public Byte getTbcState() {
        return tbcState;
    }

    public void setTbcState(Byte tbcState) {
        this.tbcState = tbcState;
    }

    public Byte getTbcStatusEx() {
        return tbcStatusEx;
    }

    public void setTbcStatusEx(Byte tbcStatusEx) {
        this.tbcStatusEx = tbcStatusEx;
    }

    public Byte getTbcStatus() {
        return tbcStatus;
    }

    public void setTbcStatus(Byte tbcStatus) {
        this.tbcStatus = tbcStatus;
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

    public String getTbcDriving() {
        return tbcDriving;
    }

    public void setTbcDriving(String tbcDriving) {
        this.tbcDriving = tbcDriving == null ? null : tbcDriving.trim();
    }

    public Short getTbcNoday() {
        return tbcNoday;
    }

    public void setTbcNoday(Short tbcNoday) {
        this.tbcNoday = tbcNoday;
    }

    public Integer getTbcYntask() {
        return tbcYntask;
    }

    public void setTbcYntask(Integer tbcYntask) {
        this.tbcYntask = tbcYntask;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbcId=").append(tbcId);
        sb.append(", tbcHost=").append(tbcHost);
        sb.append(", tbcVin=").append(tbcVin);
        sb.append(", tbcCarNo=").append(tbcCarNo);
        sb.append(", tbcNumber=").append(tbcNumber);
        sb.append(", tbcVehicle=").append(tbcVehicle);
        sb.append(", tbcProvid=").append(tbcProvid);
        sb.append(", tbcModel=").append(tbcModel);
        sb.append(", tbcArea=").append(tbcArea);
        sb.append(", tbcOutlets=").append(tbcOutlets);
        sb.append(", tbcEngine=").append(tbcEngine);
        sb.append(", tbcColor=").append(tbcColor);
        sb.append(", tbcLat=").append(tbcLat);
        sb.append(", tbcLng=").append(tbcLng);
        sb.append(", tbcEditor=").append(tbcEditor);
        sb.append(", tbcRemark=").append(tbcRemark);
        sb.append(", tbcCondition=").append(tbcCondition);
        sb.append(", tbcReason=").append(tbcReason);
        sb.append(", tbcUpdateTime=").append(tbcUpdateTime);
        sb.append(", tbcAddTime=").append(tbcAddTime);
        sb.append(", tbcState=").append(tbcState);
        sb.append(", tbcStatusEx=").append(tbcStatusEx);
        sb.append(", tbcStatus=").append(tbcStatus);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", tbcDriving=").append(tbcDriving);
        sb.append(", tbcNoday=").append(tbcNoday);
        sb.append(", tbcYntask=").append(tbcYntask);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}