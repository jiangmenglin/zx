package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class WarnType implements Serializable {
    private Long tbwtId;

    private String tbwtName;

    private Short tbwtLevel;

    private String tbwtAction;

    private Long tbwtInterval;

    private Date tbwtUpdateTime;

    private Date tbwtAddTime;

    private Short tbwtStatus;

    private static final long serialVersionUID = 1L;

    public Long getTbwtId() {
        return tbwtId;
    }

    public void setTbwtId(Long tbwtId) {
        this.tbwtId = tbwtId;
    }

    public String getTbwtName() {
        return tbwtName;
    }

    public void setTbwtName(String tbwtName) {
        this.tbwtName = tbwtName == null ? null : tbwtName.trim();
    }

    public Short getTbwtLevel() {
        return tbwtLevel;
    }

    public void setTbwtLevel(Short tbwtLevel) {
        this.tbwtLevel = tbwtLevel;
    }

    public String getTbwtAction() {
        return tbwtAction;
    }

    public void setTbwtAction(String tbwtAction) {
        this.tbwtAction = tbwtAction == null ? null : tbwtAction.trim();
    }

    public Long getTbwtInterval() {
        return tbwtInterval;
    }

    public void setTbwtInterval(Long tbwtInterval) {
        this.tbwtInterval = tbwtInterval;
    }

    public Date getTbwtUpdateTime() {
        return tbwtUpdateTime;
    }

    public void setTbwtUpdateTime(Date tbwtUpdateTime) {
        this.tbwtUpdateTime = tbwtUpdateTime;
    }

    public Date getTbwtAddTime() {
        return tbwtAddTime;
    }

    public void setTbwtAddTime(Date tbwtAddTime) {
        this.tbwtAddTime = tbwtAddTime;
    }

    public Short getTbwtStatus() {
        return tbwtStatus;
    }

    public void setTbwtStatus(Short tbwtStatus) {
        this.tbwtStatus = tbwtStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbwtId=").append(tbwtId);
        sb.append(", tbwtName=").append(tbwtName);
        sb.append(", tbwtLevel=").append(tbwtLevel);
        sb.append(", tbwtAction=").append(tbwtAction);
        sb.append(", tbwtInterval=").append(tbwtInterval);
        sb.append(", tbwtUpdateTime=").append(tbwtUpdateTime);
        sb.append(", tbwtAddTime=").append(tbwtAddTime);
        sb.append(", tbwtStatus=").append(tbwtStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}