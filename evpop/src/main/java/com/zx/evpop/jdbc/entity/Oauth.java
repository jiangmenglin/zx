package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Oauth implements Serializable {
    private Long soId;

    private String soToken;

    private Long soUserId;

    private Long soApiClient;

    private String soTicket;

    private String soParams;

    private Date soUpdateTime;

    private static final long serialVersionUID = 1L;

    public Long getSoId() {
        return soId;
    }

    public void setSoId(Long soId) {
        this.soId = soId;
    }

    public String getSoToken() {
        return soToken;
    }

    public void setSoToken(String soToken) {
        this.soToken = soToken == null ? null : soToken.trim();
    }

    public Long getSoUserId() {
        return soUserId;
    }

    public void setSoUserId(Long soUserId) {
        this.soUserId = soUserId;
    }

    public Long getSoApiClient() {
        return soApiClient;
    }

    public void setSoApiClient(Long soApiClient) {
        this.soApiClient = soApiClient;
    }

    public String getSoTicket() {
        return soTicket;
    }

    public void setSoTicket(String soTicket) {
        this.soTicket = soTicket == null ? null : soTicket.trim();
    }

    public String getSoParams() {
        return soParams;
    }

    public void setSoParams(String soParams) {
        this.soParams = soParams == null ? null : soParams.trim();
    }

    public Date getSoUpdateTime() {
        return soUpdateTime;
    }

    public void setSoUpdateTime(Date soUpdateTime) {
        this.soUpdateTime = soUpdateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", soId=").append(soId);
        sb.append(", soToken=").append(soToken);
        sb.append(", soUserId=").append(soUserId);
        sb.append(", soApiClient=").append(soApiClient);
        sb.append(", soTicket=").append(soTicket);
        sb.append(", soParams=").append(soParams);
        sb.append(", soUpdateTime=").append(soUpdateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}