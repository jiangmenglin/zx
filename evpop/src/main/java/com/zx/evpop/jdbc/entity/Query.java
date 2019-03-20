package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Query implements Serializable {
    private Long sqId;

    private String sqName;

    private String sqIcon;

    private String sqPath;

    private Long sqEditor;

    private Date sqUpdateTime;

    private Date sqAddTime;

    private Short sqStatus;

    private String sqParams;

    private static final long serialVersionUID = 1L;

    public Long getSqId() {
        return sqId;
    }

    public void setSqId(Long sqId) {
        this.sqId = sqId;
    }

    public String getSqName() {
        return sqName;
    }

    public void setSqName(String sqName) {
        this.sqName = sqName == null ? null : sqName.trim();
    }

    public String getSqIcon() {
        return sqIcon;
    }

    public void setSqIcon(String sqIcon) {
        this.sqIcon = sqIcon == null ? null : sqIcon.trim();
    }

    public String getSqPath() {
        return sqPath;
    }

    public void setSqPath(String sqPath) {
        this.sqPath = sqPath == null ? null : sqPath.trim();
    }

    public Long getSqEditor() {
        return sqEditor;
    }

    public void setSqEditor(Long sqEditor) {
        this.sqEditor = sqEditor;
    }

    public Date getSqUpdateTime() {
        return sqUpdateTime;
    }

    public void setSqUpdateTime(Date sqUpdateTime) {
        this.sqUpdateTime = sqUpdateTime;
    }

    public Date getSqAddTime() {
        return sqAddTime;
    }

    public void setSqAddTime(Date sqAddTime) {
        this.sqAddTime = sqAddTime;
    }

    public Short getSqStatus() {
        return sqStatus;
    }

    public void setSqStatus(Short sqStatus) {
        this.sqStatus = sqStatus;
    }

    public String getSqParams() {
        return sqParams;
    }

    public void setSqParams(String sqParams) {
        this.sqParams = sqParams == null ? null : sqParams.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sqId=").append(sqId);
        sb.append(", sqName=").append(sqName);
        sb.append(", sqIcon=").append(sqIcon);
        sb.append(", sqPath=").append(sqPath);
        sb.append(", sqEditor=").append(sqEditor);
        sb.append(", sqUpdateTime=").append(sqUpdateTime);
        sb.append(", sqAddTime=").append(sqAddTime);
        sb.append(", sqStatus=").append(sqStatus);
        sb.append(", sqParams=").append(sqParams);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}