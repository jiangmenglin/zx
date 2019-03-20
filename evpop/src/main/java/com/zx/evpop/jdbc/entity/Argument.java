package com.zx.evpop.jdbc.entity;

import java.io.Serializable;

public class Argument implements Serializable {
    private Long saId;

    private String saName;

    private String saFlag;

    private String saValue;

    private String saDescribe;

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

    public String getSaFlag() {
        return saFlag;
    }

    public void setSaFlag(String saFlag) {
        this.saFlag = saFlag == null ? null : saFlag.trim();
    }

    public String getSaValue() {
        return saValue;
    }

    public void setSaValue(String saValue) {
        this.saValue = saValue == null ? null : saValue.trim();
    }

    public String getSaDescribe() {
        return saDescribe;
    }

    public void setSaDescribe(String saDescribe) {
        this.saDescribe = saDescribe == null ? null : saDescribe.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", saId=").append(saId);
        sb.append(", saName=").append(saName);
        sb.append(", saFlag=").append(saFlag);
        sb.append(", saValue=").append(saValue);
        sb.append(", saDescribe=").append(saDescribe);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}