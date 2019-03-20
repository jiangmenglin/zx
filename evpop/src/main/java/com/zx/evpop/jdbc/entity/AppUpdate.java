package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class AppUpdate implements Serializable {
    private Integer serialNo;

    private String channel;

    private String appVersion;

    private String deviceType;

    private Byte appStatus;

    private Date createDate;

    private Date lastUpdateDate;

    private String changeLog;

    private static final long serialVersionUID = 1L;

    public Integer getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(Integer serialNo) {
        this.serialNo = serialNo;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion == null ? null : appVersion.trim();
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    public Byte getAppStatus() {
        return appStatus;
    }

    public void setAppStatus(Byte appStatus) {
        this.appStatus = appStatus;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getChangeLog() {
        return changeLog;
    }

    public void setChangeLog(String changeLog) {
        this.changeLog = changeLog == null ? null : changeLog.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialNo=").append(serialNo);
        sb.append(", channel=").append(channel);
        sb.append(", appVersion=").append(appVersion);
        sb.append(", deviceType=").append(deviceType);
        sb.append(", appStatus=").append(appStatus);
        sb.append(", createDate=").append(createDate);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", changeLog=").append(changeLog);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}