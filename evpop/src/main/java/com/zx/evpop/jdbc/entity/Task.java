package com.zx.evpop.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

public class Task implements Serializable {
    private Long tbtId;

    private Long tbtHost;

    private Byte tbtType;

    private Long tbtCar;

    private Integer tbtUser;

    private Long tbtAreaTask;

    private Long tbtAreaFrom;

    private Long tbtOutletsFrom;

    private Long tbtAreaTo;

    private Long tbtOutletsTo;

    private String tbtRemark;

    private String tbtImages;

    private Byte tbtChannel;

    private Date tbtRecvTime;

    private Date tbtEndTime;

    private Date tbtUpdateTime;

    private Date tbtAddTime;

    private String tbtLog;

    private Byte tbtStatus;

    private static final long serialVersionUID = 1L;

    public Long getTbtId() {
        return tbtId;
    }

    public void setTbtId(Long tbtId) {
        this.tbtId = tbtId;
    }

    public Long getTbtHost() {
        return tbtHost;
    }

    public void setTbtHost(Long tbtHost) {
        this.tbtHost = tbtHost;
    }

    public Byte getTbtType() {
        return tbtType;
    }

    public void setTbtType(Byte tbtType) {
        this.tbtType = tbtType;
    }

    public Long getTbtCar() {
        return tbtCar;
    }

    public void setTbtCar(Long tbtCar) {
        this.tbtCar = tbtCar;
    }

    public Integer getTbtUser() {
        return tbtUser;
    }

    public void setTbtUser(Integer tbtUser) {
        this.tbtUser = tbtUser;
    }

    public Long getTbtAreaTask() {
        return tbtAreaTask;
    }

    public void setTbtAreaTask(Long tbtAreaTask) {
        this.tbtAreaTask = tbtAreaTask;
    }

    public Long getTbtAreaFrom() {
        return tbtAreaFrom;
    }

    public void setTbtAreaFrom(Long tbtAreaFrom) {
        this.tbtAreaFrom = tbtAreaFrom;
    }

    public Long getTbtOutletsFrom() {
        return tbtOutletsFrom;
    }

    public void setTbtOutletsFrom(Long tbtOutletsFrom) {
        this.tbtOutletsFrom = tbtOutletsFrom;
    }

    public Long getTbtAreaTo() {
        return tbtAreaTo;
    }

    public void setTbtAreaTo(Long tbtAreaTo) {
        this.tbtAreaTo = tbtAreaTo;
    }

    public Long getTbtOutletsTo() {
        return tbtOutletsTo;
    }

    public void setTbtOutletsTo(Long tbtOutletsTo) {
        this.tbtOutletsTo = tbtOutletsTo;
    }

    public String getTbtRemark() {
        return tbtRemark;
    }

    public void setTbtRemark(String tbtRemark) {
        this.tbtRemark = tbtRemark == null ? null : tbtRemark.trim();
    }

    public String getTbtImages() {
        return tbtImages;
    }

    public void setTbtImages(String tbtImages) {
        this.tbtImages = tbtImages == null ? null : tbtImages.trim();
    }

    public Byte getTbtChannel() {
        return tbtChannel;
    }

    public void setTbtChannel(Byte tbtChannel) {
        this.tbtChannel = tbtChannel;
    }

    public Date getTbtRecvTime() {
        return tbtRecvTime;
    }

    public void setTbtRecvTime(Date tbtRecvTime) {
        this.tbtRecvTime = tbtRecvTime;
    }

    public Date getTbtEndTime() {
        return tbtEndTime;
    }

    public void setTbtEndTime(Date tbtEndTime) {
        this.tbtEndTime = tbtEndTime;
    }

    public Date getTbtUpdateTime() {
        return tbtUpdateTime;
    }

    public void setTbtUpdateTime(Date tbtUpdateTime) {
        this.tbtUpdateTime = tbtUpdateTime;
    }

    public Date getTbtAddTime() {
        return tbtAddTime;
    }

    public void setTbtAddTime(Date tbtAddTime) {
        this.tbtAddTime = tbtAddTime;
    }

    public String getTbtLog() {
        return tbtLog;
    }

    public void setTbtLog(String tbtLog) {
        this.tbtLog = tbtLog == null ? null : tbtLog.trim();
    }

    public Byte getTbtStatus() {
        return tbtStatus;
    }

    public void setTbtStatus(Byte tbtStatus) {
        this.tbtStatus = tbtStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tbtId=").append(tbtId);
        sb.append(", tbtHost=").append(tbtHost);
        sb.append(", tbtType=").append(tbtType);
        sb.append(", tbtCar=").append(tbtCar);
        sb.append(", tbtUser=").append(tbtUser);
        sb.append(", tbtAreaTask=").append(tbtAreaTask);
        sb.append(", tbtAreaFrom=").append(tbtAreaFrom);
        sb.append(", tbtOutletsFrom=").append(tbtOutletsFrom);
        sb.append(", tbtAreaTo=").append(tbtAreaTo);
        sb.append(", tbtOutletsTo=").append(tbtOutletsTo);
        sb.append(", tbtRemark=").append(tbtRemark);
        sb.append(", tbtImages=").append(tbtImages);
        sb.append(", tbtChannel=").append(tbtChannel);
        sb.append(", tbtRecvTime=").append(tbtRecvTime);
        sb.append(", tbtEndTime=").append(tbtEndTime);
        sb.append(", tbtUpdateTime=").append(tbtUpdateTime);
        sb.append(", tbtAddTime=").append(tbtAddTime);
        sb.append(", tbtLog=").append(tbtLog);
        sb.append(", tbtStatus=").append(tbtStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}