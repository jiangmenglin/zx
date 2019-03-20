package com.zx.evpop.jdbc.entity;

import java.io.Serializable;

public class Property implements Serializable {
    private Long spId;

    private String spName;

    private Long spParent;

    private String spFlag;

    private Long spNumber;

    private String spValue;

    private Short spStatus;

    private String spText;

    private static final long serialVersionUID = 1L;

    public Long getSpId() {
        return spId;
    }

    public void setSpId(Long spId) {
        this.spId = spId;
    }

    public String getSpName() {
        return spName;
    }

    public void setSpName(String spName) {
        this.spName = spName == null ? null : spName.trim();
    }

    public Long getSpParent() {
        return spParent;
    }

    public void setSpParent(Long spParent) {
        this.spParent = spParent;
    }

    public String getSpFlag() {
        return spFlag;
    }

    public void setSpFlag(String spFlag) {
        this.spFlag = spFlag == null ? null : spFlag.trim();
    }

    public Long getSpNumber() {
        return spNumber;
    }

    public void setSpNumber(Long spNumber) {
        this.spNumber = spNumber;
    }

    public String getSpValue() {
        return spValue;
    }

    public void setSpValue(String spValue) {
        this.spValue = spValue == null ? null : spValue.trim();
    }

    public Short getSpStatus() {
        return spStatus;
    }

    public void setSpStatus(Short spStatus) {
        this.spStatus = spStatus;
    }

    public String getSpText() {
        return spText;
    }

    public void setSpText(String spText) {
        this.spText = spText == null ? null : spText.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", spId=").append(spId);
        sb.append(", spName=").append(spName);
        sb.append(", spParent=").append(spParent);
        sb.append(", spFlag=").append(spFlag);
        sb.append(", spNumber=").append(spNumber);
        sb.append(", spValue=").append(spValue);
        sb.append(", spStatus=").append(spStatus);
        sb.append(", spText=").append(spText);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}