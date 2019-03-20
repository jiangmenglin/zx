package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class UnitChannel implements Serializable {
    private Long tbucId;

    private String tbucName;

    private Long tbucPartner;

    private String tbucChannelId;

    private Date tbucUpdateTime;

    private Date tbucAddTime;

    private Short tbucStatus;

    private static final long serialVersionUID = 1L;

    public Long getTbucId() {
        return tbucId;
    }

    public void setTbucId(Long tbucId) {
        this.tbucId = tbucId;
    }

    public String getTbucName() {
        return tbucName;
    }

    public void setTbucName(String tbucName) {
        this.tbucName = tbucName == null ? null : tbucName.trim();
    }

    public Long getTbucPartner() {
        return tbucPartner;
    }

    public void setTbucPartner(Long tbucPartner) {
        this.tbucPartner = tbucPartner;
    }

    public String getTbucChannelId() {
        return tbucChannelId;
    }

    public void setTbucChannelId(String tbucChannelId) {
        this.tbucChannelId = tbucChannelId == null ? null : tbucChannelId.trim();
    }

    public Date getTbucUpdateTime() {
        return tbucUpdateTime;
    }

    public void setTbucUpdateTime(Date tbucUpdateTime) {
        this.tbucUpdateTime = tbucUpdateTime;
    }

    public Date getTbucAddTime() {
        return tbucAddTime;
    }

    public void setTbucAddTime(Date tbucAddTime) {
        this.tbucAddTime = tbucAddTime;
    }

    public Short getTbucStatus() {
        return tbucStatus;
    }

    public void setTbucStatus(Short tbucStatus) {
        this.tbucStatus = tbucStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbucId=").append(tbucId);
        sb.append(", tbucName=").append(tbucName);
        sb.append(", tbucPartner=").append(tbucPartner);
        sb.append(", tbucChannelId=").append(tbucChannelId);
        sb.append(", tbucUpdateTime=").append(tbucUpdateTime);
        sb.append(", tbucAddTime=").append(tbucAddTime);
        sb.append(", tbucStatus=").append(tbucStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}