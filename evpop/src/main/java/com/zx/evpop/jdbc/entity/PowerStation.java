package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class PowerStation implements Serializable {
    private Long tbpsId;

    private Long tbpsHost;

    private Long tbpsArea;

    private Long tbpsOutlets;

    private Long tbpsSupplier;

    private String tbpsName;

    private String tbpsFlag;

    private String tbpsAddress;

    private Double tbpsLongitude;

    private Double tbpsLatitude;

    private Integer tbpsFast;

    private Integer tbpsSlow;

    private String tbpsPerson;

    private String tbpsTel;

    private String tbpsTimeDesc;

    private String tbpsFeeServer;

    private String tbpsFeePark;

    private String tbpsProfile;

    private String tbpsRemark;

    private Date tbpsUpdateTime;

    private Date tbpsAddTime;

    private Short tbpsStatus;

    private static final long serialVersionUID = 1L;

    public Long getTbpsId() {
        return tbpsId;
    }

    public void setTbpsId(Long tbpsId) {
        this.tbpsId = tbpsId;
    }

    public Long getTbpsHost() {
        return tbpsHost;
    }

    public void setTbpsHost(Long tbpsHost) {
        this.tbpsHost = tbpsHost;
    }

    public Long getTbpsArea() {
        return tbpsArea;
    }

    public void setTbpsArea(Long tbpsArea) {
        this.tbpsArea = tbpsArea;
    }

    public Long getTbpsOutlets() {
        return tbpsOutlets;
    }

    public void setTbpsOutlets(Long tbpsOutlets) {
        this.tbpsOutlets = tbpsOutlets;
    }

    public Long getTbpsSupplier() {
        return tbpsSupplier;
    }

    public void setTbpsSupplier(Long tbpsSupplier) {
        this.tbpsSupplier = tbpsSupplier;
    }

    public String getTbpsName() {
        return tbpsName;
    }

    public void setTbpsName(String tbpsName) {
        this.tbpsName = tbpsName == null ? null : tbpsName.trim();
    }

    public String getTbpsFlag() {
        return tbpsFlag;
    }

    public void setTbpsFlag(String tbpsFlag) {
        this.tbpsFlag = tbpsFlag == null ? null : tbpsFlag.trim();
    }

    public String getTbpsAddress() {
        return tbpsAddress;
    }

    public void setTbpsAddress(String tbpsAddress) {
        this.tbpsAddress = tbpsAddress == null ? null : tbpsAddress.trim();
    }

    public Double getTbpsLongitude() {
        return tbpsLongitude;
    }

    public void setTbpsLongitude(Double tbpsLongitude) {
        this.tbpsLongitude = tbpsLongitude;
    }

    public Double getTbpsLatitude() {
        return tbpsLatitude;
    }

    public void setTbpsLatitude(Double tbpsLatitude) {
        this.tbpsLatitude = tbpsLatitude;
    }

    public Integer getTbpsFast() {
        return tbpsFast;
    }

    public void setTbpsFast(Integer tbpsFast) {
        this.tbpsFast = tbpsFast;
    }

    public Integer getTbpsSlow() {
        return tbpsSlow;
    }

    public void setTbpsSlow(Integer tbpsSlow) {
        this.tbpsSlow = tbpsSlow;
    }

    public String getTbpsPerson() {
        return tbpsPerson;
    }

    public void setTbpsPerson(String tbpsPerson) {
        this.tbpsPerson = tbpsPerson == null ? null : tbpsPerson.trim();
    }

    public String getTbpsTel() {
        return tbpsTel;
    }

    public void setTbpsTel(String tbpsTel) {
        this.tbpsTel = tbpsTel == null ? null : tbpsTel.trim();
    }

    public String getTbpsTimeDesc() {
        return tbpsTimeDesc;
    }

    public void setTbpsTimeDesc(String tbpsTimeDesc) {
        this.tbpsTimeDesc = tbpsTimeDesc == null ? null : tbpsTimeDesc.trim();
    }

    public String getTbpsFeeServer() {
        return tbpsFeeServer;
    }

    public void setTbpsFeeServer(String tbpsFeeServer) {
        this.tbpsFeeServer = tbpsFeeServer == null ? null : tbpsFeeServer.trim();
    }

    public String getTbpsFeePark() {
        return tbpsFeePark;
    }

    public void setTbpsFeePark(String tbpsFeePark) {
        this.tbpsFeePark = tbpsFeePark == null ? null : tbpsFeePark.trim();
    }

    public String getTbpsProfile() {
        return tbpsProfile;
    }

    public void setTbpsProfile(String tbpsProfile) {
        this.tbpsProfile = tbpsProfile == null ? null : tbpsProfile.trim();
    }

    public String getTbpsRemark() {
        return tbpsRemark;
    }

    public void setTbpsRemark(String tbpsRemark) {
        this.tbpsRemark = tbpsRemark == null ? null : tbpsRemark.trim();
    }

    public Date getTbpsUpdateTime() {
        return tbpsUpdateTime;
    }

    public void setTbpsUpdateTime(Date tbpsUpdateTime) {
        this.tbpsUpdateTime = tbpsUpdateTime;
    }

    public Date getTbpsAddTime() {
        return tbpsAddTime;
    }

    public void setTbpsAddTime(Date tbpsAddTime) {
        this.tbpsAddTime = tbpsAddTime;
    }

    public Short getTbpsStatus() {
        return tbpsStatus;
    }

    public void setTbpsStatus(Short tbpsStatus) {
        this.tbpsStatus = tbpsStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbpsId=").append(tbpsId);
        sb.append(", tbpsHost=").append(tbpsHost);
        sb.append(", tbpsArea=").append(tbpsArea);
        sb.append(", tbpsOutlets=").append(tbpsOutlets);
        sb.append(", tbpsSupplier=").append(tbpsSupplier);
        sb.append(", tbpsName=").append(tbpsName);
        sb.append(", tbpsFlag=").append(tbpsFlag);
        sb.append(", tbpsAddress=").append(tbpsAddress);
        sb.append(", tbpsLongitude=").append(tbpsLongitude);
        sb.append(", tbpsLatitude=").append(tbpsLatitude);
        sb.append(", tbpsFast=").append(tbpsFast);
        sb.append(", tbpsSlow=").append(tbpsSlow);
        sb.append(", tbpsPerson=").append(tbpsPerson);
        sb.append(", tbpsTel=").append(tbpsTel);
        sb.append(", tbpsTimeDesc=").append(tbpsTimeDesc);
        sb.append(", tbpsFeeServer=").append(tbpsFeeServer);
        sb.append(", tbpsFeePark=").append(tbpsFeePark);
        sb.append(", tbpsProfile=").append(tbpsProfile);
        sb.append(", tbpsRemark=").append(tbpsRemark);
        sb.append(", tbpsUpdateTime=").append(tbpsUpdateTime);
        sb.append(", tbpsAddTime=").append(tbpsAddTime);
        sb.append(", tbpsStatus=").append(tbpsStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}