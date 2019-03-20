package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Sql implements Serializable {
    private Long ssId;

    private String ssName;

    private String ssSql;

    private Integer ssInterval;

    private Date ssLast;

    private Date ssUpdateTime;

    private Date ssAddTime;

    private Short ssStatus;

    private static final long serialVersionUID = 1L;

    public Long getSsId() {
        return ssId;
    }

    public void setSsId(Long ssId) {
        this.ssId = ssId;
    }

    public String getSsName() {
        return ssName;
    }

    public void setSsName(String ssName) {
        this.ssName = ssName == null ? null : ssName.trim();
    }

    public String getSsSql() {
        return ssSql;
    }

    public void setSsSql(String ssSql) {
        this.ssSql = ssSql == null ? null : ssSql.trim();
    }

    public Integer getSsInterval() {
        return ssInterval;
    }

    public void setSsInterval(Integer ssInterval) {
        this.ssInterval = ssInterval;
    }

    public Date getSsLast() {
        return ssLast;
    }

    public void setSsLast(Date ssLast) {
        this.ssLast = ssLast;
    }

    public Date getSsUpdateTime() {
        return ssUpdateTime;
    }

    public void setSsUpdateTime(Date ssUpdateTime) {
        this.ssUpdateTime = ssUpdateTime;
    }

    public Date getSsAddTime() {
        return ssAddTime;
    }

    public void setSsAddTime(Date ssAddTime) {
        this.ssAddTime = ssAddTime;
    }

    public Short getSsStatus() {
        return ssStatus;
    }

    public void setSsStatus(Short ssStatus) {
        this.ssStatus = ssStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ssId=").append(ssId);
        sb.append(", ssName=").append(ssName);
        sb.append(", ssSql=").append(ssSql);
        sb.append(", ssInterval=").append(ssInterval);
        sb.append(", ssLast=").append(ssLast);
        sb.append(", ssUpdateTime=").append(ssUpdateTime);
        sb.append(", ssAddTime=").append(ssAddTime);
        sb.append(", ssStatus=").append(ssStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}