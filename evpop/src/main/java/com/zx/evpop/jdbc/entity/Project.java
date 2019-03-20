package com.zx.evpop.jdbc.entity;

import java.io.Serializable;

public class Project implements Serializable {
    private Long spId;

    private String spName;

    private Long spParentId;

    private String spFamily;

    private String spUrl;

    private String spLogo;

    private String spDescript;

    private Integer spLevel;

    private String spLimitExp;

    private String spGroup;

    private Short spStatus;

    private String spMind;

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

    public Long getSpParentId() {
        return spParentId;
    }

    public void setSpParentId(Long spParentId) {
        this.spParentId = spParentId;
    }

    public String getSpFamily() {
        return spFamily;
    }

    public void setSpFamily(String spFamily) {
        this.spFamily = spFamily == null ? null : spFamily.trim();
    }

    public String getSpUrl() {
        return spUrl;
    }

    public void setSpUrl(String spUrl) {
        this.spUrl = spUrl == null ? null : spUrl.trim();
    }

    public String getSpLogo() {
        return spLogo;
    }

    public void setSpLogo(String spLogo) {
        this.spLogo = spLogo == null ? null : spLogo.trim();
    }

    public String getSpDescript() {
        return spDescript;
    }

    public void setSpDescript(String spDescript) {
        this.spDescript = spDescript == null ? null : spDescript.trim();
    }

    public Integer getSpLevel() {
        return spLevel;
    }

    public void setSpLevel(Integer spLevel) {
        this.spLevel = spLevel;
    }

    public String getSpLimitExp() {
        return spLimitExp;
    }

    public void setSpLimitExp(String spLimitExp) {
        this.spLimitExp = spLimitExp == null ? null : spLimitExp.trim();
    }

    public String getSpGroup() {
        return spGroup;
    }

    public void setSpGroup(String spGroup) {
        this.spGroup = spGroup == null ? null : spGroup.trim();
    }

    public Short getSpStatus() {
        return spStatus;
    }

    public void setSpStatus(Short spStatus) {
        this.spStatus = spStatus;
    }

    public String getSpMind() {
        return spMind;
    }

    public void setSpMind(String spMind) {
        this.spMind = spMind == null ? null : spMind.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", spId=").append(spId);
        sb.append(", spName=").append(spName);
        sb.append(", spParentId=").append(spParentId);
        sb.append(", spFamily=").append(spFamily);
        sb.append(", spUrl=").append(spUrl);
        sb.append(", spLogo=").append(spLogo);
        sb.append(", spDescript=").append(spDescript);
        sb.append(", spLevel=").append(spLevel);
        sb.append(", spLimitExp=").append(spLimitExp);
        sb.append(", spGroup=").append(spGroup);
        sb.append(", spStatus=").append(spStatus);
        sb.append(", spMind=").append(spMind);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}