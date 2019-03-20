package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class ApiClient implements Serializable {
    private Long sacId;

    private String sacClient;

    private String sacSecret;

    private Short sacType;

    private String sacUrl;

    private String sacDesc;

    private String sacRestful;

    private Date sacUpdateTime;

    private Date sacAddTime;

    private Short sacStatus;

    private static final long serialVersionUID = 1L;

    public Long getSacId() {
        return sacId;
    }

    public void setSacId(Long sacId) {
        this.sacId = sacId;
    }

    public String getSacClient() {
        return sacClient;
    }

    public void setSacClient(String sacClient) {
        this.sacClient = sacClient == null ? null : sacClient.trim();
    }

    public String getSacSecret() {
        return sacSecret;
    }

    public void setSacSecret(String sacSecret) {
        this.sacSecret = sacSecret == null ? null : sacSecret.trim();
    }

    public Short getSacType() {
        return sacType;
    }

    public void setSacType(Short sacType) {
        this.sacType = sacType;
    }

    public String getSacUrl() {
        return sacUrl;
    }

    public void setSacUrl(String sacUrl) {
        this.sacUrl = sacUrl == null ? null : sacUrl.trim();
    }

    public String getSacDesc() {
        return sacDesc;
    }

    public void setSacDesc(String sacDesc) {
        this.sacDesc = sacDesc == null ? null : sacDesc.trim();
    }

    public String getSacRestful() {
        return sacRestful;
    }

    public void setSacRestful(String sacRestful) {
        this.sacRestful = sacRestful == null ? null : sacRestful.trim();
    }

    public Date getSacUpdateTime() {
        return sacUpdateTime;
    }

    public void setSacUpdateTime(Date sacUpdateTime) {
        this.sacUpdateTime = sacUpdateTime;
    }

    public Date getSacAddTime() {
        return sacAddTime;
    }

    public void setSacAddTime(Date sacAddTime) {
        this.sacAddTime = sacAddTime;
    }

    public Short getSacStatus() {
        return sacStatus;
    }

    public void setSacStatus(Short sacStatus) {
        this.sacStatus = sacStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sacId=").append(sacId);
        sb.append(", sacClient=").append(sacClient);
        sb.append(", sacSecret=").append(sacSecret);
        sb.append(", sacType=").append(sacType);
        sb.append(", sacUrl=").append(sacUrl);
        sb.append(", sacDesc=").append(sacDesc);
        sb.append(", sacRestful=").append(sacRestful);
        sb.append(", sacUpdateTime=").append(sacUpdateTime);
        sb.append(", sacAddTime=").append(sacAddTime);
        sb.append(", sacStatus=").append(sacStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}