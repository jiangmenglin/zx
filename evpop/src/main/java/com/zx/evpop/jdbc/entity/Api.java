package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Api implements Serializable {
    private Long saId;

    private String saName;

    private String saNamespace;

    private Long saType;

    private Short saVersion;

    private Short saOpen;

    private Short saOauth;

    private String saDescript;

    private String saClass;

    private Short saDir;

    private String saMethod;

    private String saParams;

    private String saReturnStruct;

    private String saError;

    private Short saSaveLog;

    private Date saUpdateTime;

    private Date saAddTime;

    private Short saStatus;

    private static final long serialVersionUID = 1L;

    public Long getSaId() {
        return saId;
    }

    public void setSaId(Long saId) {
        this.saId = saId;
    }

    public String getSaName() {
        return saName;
    }

    public void setSaName(String saName) {
        this.saName = saName == null ? null : saName.trim();
    }

    public String getSaNamespace() {
        return saNamespace;
    }

    public void setSaNamespace(String saNamespace) {
        this.saNamespace = saNamespace == null ? null : saNamespace.trim();
    }

    public Long getSaType() {
        return saType;
    }

    public void setSaType(Long saType) {
        this.saType = saType;
    }

    public Short getSaVersion() {
        return saVersion;
    }

    public void setSaVersion(Short saVersion) {
        this.saVersion = saVersion;
    }

    public Short getSaOpen() {
        return saOpen;
    }

    public void setSaOpen(Short saOpen) {
        this.saOpen = saOpen;
    }

    public Short getSaOauth() {
        return saOauth;
    }

    public void setSaOauth(Short saOauth) {
        this.saOauth = saOauth;
    }

    public String getSaDescript() {
        return saDescript;
    }

    public void setSaDescript(String saDescript) {
        this.saDescript = saDescript == null ? null : saDescript.trim();
    }

    public String getSaClass() {
        return saClass;
    }

    public void setSaClass(String saClass) {
        this.saClass = saClass == null ? null : saClass.trim();
    }

    public Short getSaDir() {
        return saDir;
    }

    public void setSaDir(Short saDir) {
        this.saDir = saDir;
    }

    public String getSaMethod() {
        return saMethod;
    }

    public void setSaMethod(String saMethod) {
        this.saMethod = saMethod == null ? null : saMethod.trim();
    }

    public String getSaParams() {
        return saParams;
    }

    public void setSaParams(String saParams) {
        this.saParams = saParams == null ? null : saParams.trim();
    }

    public String getSaReturnStruct() {
        return saReturnStruct;
    }

    public void setSaReturnStruct(String saReturnStruct) {
        this.saReturnStruct = saReturnStruct == null ? null : saReturnStruct.trim();
    }

    public String getSaError() {
        return saError;
    }

    public void setSaError(String saError) {
        this.saError = saError == null ? null : saError.trim();
    }

    public Short getSaSaveLog() {
        return saSaveLog;
    }

    public void setSaSaveLog(Short saSaveLog) {
        this.saSaveLog = saSaveLog;
    }

    public Date getSaUpdateTime() {
        return saUpdateTime;
    }

    public void setSaUpdateTime(Date saUpdateTime) {
        this.saUpdateTime = saUpdateTime;
    }

    public Date getSaAddTime() {
        return saAddTime;
    }

    public void setSaAddTime(Date saAddTime) {
        this.saAddTime = saAddTime;
    }

    public Short getSaStatus() {
        return saStatus;
    }

    public void setSaStatus(Short saStatus) {
        this.saStatus = saStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", saId=").append(saId);
        sb.append(", saName=").append(saName);
        sb.append(", saNamespace=").append(saNamespace);
        sb.append(", saType=").append(saType);
        sb.append(", saVersion=").append(saVersion);
        sb.append(", saOpen=").append(saOpen);
        sb.append(", saOauth=").append(saOauth);
        sb.append(", saDescript=").append(saDescript);
        sb.append(", saClass=").append(saClass);
        sb.append(", saDir=").append(saDir);
        sb.append(", saMethod=").append(saMethod);
        sb.append(", saParams=").append(saParams);
        sb.append(", saReturnStruct=").append(saReturnStruct);
        sb.append(", saError=").append(saError);
        sb.append(", saSaveLog=").append(saSaveLog);
        sb.append(", saUpdateTime=").append(saUpdateTime);
        sb.append(", saAddTime=").append(saAddTime);
        sb.append(", saStatus=").append(saStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}